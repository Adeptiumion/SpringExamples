package Tests;

import Entity.Employee;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test27 {
    // Удаление одного Entity
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, 3);
            session.remove(employee);
            transaction.commit();
        }
    }
}
