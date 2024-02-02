package Tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import Util.Util;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.logging.Logger;


public class Test21 {

    private static final Logger test21Logger = Logger.getLogger(Test21.class.getName());

    // Кейс с нормальным конфигурированием Hibernate через Java code:
    public static void main(String[] args) {

        // Настройки Hibernate в Util.getConfiguration()
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession()) {
            // Session:
            // * Session - это обертка вокруг подключения к БД с помощью JDBC.
            // * Session - это основа для работы с БД. Именно с помощью Session получаются,
            //   добавляются и производятся другие операции с Java Объектами в БД.
            // * Жизненный цикл Session обычно не велик. Мы получаем Session, делаем
            //   с помощью неё определённые операции и она становится ненужной.
            test21Logger.info("Session is open ? -> " + session.isOpen());
            transaction = session.beginTransaction();
            session.persist(Util.getEmployee());
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null){
                transaction.rollback();
                test21Logger.severe("Error save user in table!");
                test21Logger.severe(Arrays.toString(e.getStackTrace()));
            }
        }
    }
}
