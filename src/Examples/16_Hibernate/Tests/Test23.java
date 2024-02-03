package Tests;

import Entity.Employee;
import Util.Util;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Test23 {

    private static final Logger test23Logger = Logger.getLogger(Test23.class.getName());


    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession()) {
            test23Logger.info("Session is open? -> " + session.isOpen());
            transaction = session.beginTransaction();
            test23Logger.info("Status of transaction -> " + transaction.getStatus());



            List<Employee> employeeList = session
                    .createQuery("from Employee", Employee.class).list();


            employeeList.forEach(System.out::println);
            transaction.commit();

        } catch (Exception e) {
            test23Logger.severe("Cant take object's: " + e.getMessage());
            if (transaction != null)
                transaction.rollback();
        }
    }
}
