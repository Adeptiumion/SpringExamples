package Tests;

import Entity.Employee;


import Resources.Config;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.logging.Logger;

public class Test20 {
    private static final Logger test20Logger = Logger.getLogger(Test20.class.getName());

    // Кейс c древним конфигурированием Hibernate на XML:
    public static void main(String[] args) {
        // SessionFactory:
        // * Фабрика по производству сессий.
        // * SessionFactory читает "hibernate.cfg.xml", после чего шарит как создавать сессии.
        SessionFactory factory =
                new Configuration()
                        .configure("Resources/hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();
        // Session:
        // * Session - это обертка вокруг подключения к БД с помощью JDBC.
        // * Session - это основа для работы с БД. Именно с помощью Session получаются,
        //   добавляются и производятся другие операции с Java Объектами в БД.
        // * Жизненный цикл Session обычно не велик. Мы получаем Session, делаем
        //   с помощью неё определённые операции и она становится ненужной.
        try {
            Session session = factory.getCurrentSession();
            Employee employee = Util.getEmployee();
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        } finally {
            factory.close();
            test20Logger.info("Session is closed!");
        }
    }
}
