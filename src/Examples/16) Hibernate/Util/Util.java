package Util;

import Entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.imageio.spi.ServiceRegistry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class Util {

    private static final Employee employee = new Employee(2000, "Danil", "Kvardakov", "Middle+ developer");
    private static final Logger utilLogger = Logger.getLogger(Util.class.getName());
    private static String url = "jdbc:mysql://localhost:3306/employees";
    private static final String login = "root";
    private static final String password = "root";
    private static final String dialect = "org.hibernate.dialect.MySQLDialect";
    private static final String currentSessionContextClass = "thread";
    private static final List<String> hbm2ddlAuto = List.of(
            "validate",     // 0 проверяет схему, не вносит изменений в базу данных.
            "update",       // 1 обновляет схему.
            "create",       // 2 создает схему, уничтожая предыдущие данные.
            "create-drop",  // 3 удалить схему, когда SessionFactory закрывается явно, обычно, когда приложение остановлено.
            "none"          // 4 ничего не делает со схемой, не вносит изменений в базу данных
    );
    private static final File makeScriptFile = new File(
            "C:\\" +
                    "Users\\" +
                    "79520\\" +
                    "IdeaProjects\\" +
                    "Spring_examples\\" +
                    "src\\" +
                    "Examples\\" +
                    "16) Hibernate\\" +
                    "Scripts\\" +
                    "Make_employees\\" +
                    "makeEmployees.txt"
    );
    private static final File clearScriptFile = new File(
            "C:\\" +
                    "Users\\" +
                    "79520\\" +
                    "IdeaProjects\\" +
                    "Spring_examples\\" +
                    "src\\" +
                    "Examples\\" +
                    "16) Hibernate\\" +
                    "Scripts\\" +
                    "Clear_employees\\" +
                    "clearEmployees.txt"
    );
    private static SessionFactory sessionFactory;
    private static Connection connection;
    private static boolean connectionIsOpen = false;

    public static Connection makeConnection() {
        try {
            connection = DriverManager.getConnection(url, login, password);
            connection.setAutoCommit(false);
            utilLogger.info("Connection is created!");
        } catch (SQLException sql) {
            utilLogger.severe("Error while creating connection!");
            utilLogger.severe("Message: \n" + sql.getMessage());
            utilLogger.severe("SQL error code: " + sql.getErrorCode() + "\n");
            sql.printStackTrace();
        }
        connectionIsOpen = true;
        return connection;
    }

    public static void exitConnection() {
        try {
            connection.close();
            connectionIsOpen = false;
            utilLogger.info("Connection is closed!");
        } catch (SQLException sql) {
            utilLogger.severe("Error when closing connection!");
            utilLogger.severe("Message: \n" + sql.getMessage());
            utilLogger.severe("SQL error code: " + sql.getErrorCode() + "\n");
            sql.printStackTrace();
        }
    }

    public static String getScript(File file) {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new FileReader(file)) {
            int marker;
            while ((marker = reader.read()) != -1) {
                sb.append((char) marker);
            }
            utilLogger.info("Script " + file.getName() + " is received!");
        } catch (FileNotFoundException f) {
            utilLogger.severe("Error - no way to get the script!");
            utilLogger.severe("Message: " + f.getMessage());
            f.printStackTrace();
        } catch (IOException i) {
            utilLogger.severe("Error - no way to get the script!");
            utilLogger.severe("Message: " + i.getMessage());
            i.printStackTrace();
        }
        return sb.toString();
    }

    public static void makeTable(Connection connection) {
        if (connection == null) {
            utilLogger.severe("Error - the connection does not exist!");
            throw new NullPointerException();
        }

        try (Statement statement = connection.createStatement()) {
            statement.execute(getScript(makeScriptFile));
            utilLogger.info("Table is created!");
        } catch (SQLException e) {
            utilLogger.severe("Error while creating table!");
            utilLogger.severe("Error - there is no way to create a table!");
            utilLogger.severe("SQL exception message: " + e.getMessage() + "\n" +
                    "      SQL error code: " + e.getErrorCode() + "\n");
        }
    }

    public static void clearTable() {
        if (connection == null)
            throw new NullPointerException();

        try (Statement statement = connection.createStatement()) {
            statement.execute(getScript(clearScriptFile));
            utilLogger.info("Table is cleared!");
        } catch (SQLException e) {
            utilLogger.severe("Table clearing error!");
            utilLogger.severe("SQL exception message: " + e.getMessage() + "\n" +
                    "      SQL error code: " + e.getErrorCode() + "\n");
        }
    }

    public static SessionFactory getSessionFactory() {
        // SessionFactory:
        // * Фабрика по производству сессий.
        // * SessionFactory читает "hibernate.cfg.xml", после чего шарит как создавать сессии.
        if (sessionFactory == null) {
            Configuration cfg = getConfiguration();
            cfg.addAnnotatedClass(Employee.class);
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();

            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
            utilLogger.info("SessionFactory is created!");
        }
        utilLogger.info("SessionFactory is received!");
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory(List<Class<?>> entityList) {
        // SessionFactory:
        // * Фабрика по производству сессий.
        // * SessionFactory читает "hibernate.cfg.xml", после чего шарит как создавать сессии.
        if (sessionFactory == null) {
            Configuration cfg = getConfiguration();
            for (Class<?> c : entityList)
                cfg.addAnnotatedClass(c);
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();

            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
            utilLogger.info("SessionFactory is created!");
        }
        utilLogger.info("SessionFactory is received!");
        return sessionFactory;
    }

    private static Configuration getConfiguration() {
        Configuration cfg = new Configuration();
        Properties props = new Properties();
        props.put(Environment.USE_SQL_COMMENTS, true);
        props.put(Environment.SHOW_SQL, true);
        props.put(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        props.put(Environment.JAKARTA_JDBC_URL, url + "?useSSL=false");
        props.put(Environment.JAKARTA_JDBC_USER, login);
        props.put(Environment.JAKARTA_JDBC_PASSWORD, password);
        props.put(Environment.DIALECT, dialect);
        props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, currentSessionContextClass);
        props.put(Environment.HBM2DDL_AUTO, hbm2ddlAuto.get(4)); // None

        cfg.setProperties(props);
        utilLogger.info("Hibernate config is created!");
        return cfg;
    }

    public static void setUrl(String url) {
        Util.url = "jdbc:mysql://localhost:3306/" + url;
    }

    public static Employee getEmployee() {
        return employee;
    }
}
