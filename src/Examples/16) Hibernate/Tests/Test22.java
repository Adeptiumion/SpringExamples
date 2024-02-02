package Tests;

import Entity.Employee;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test22 {
    public static void main(String[] args) {

        Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            System.out.println(session.get(Employee.class, 1)); // Получаю работника по id;
            transaction.commit();
        } catch (Exception e){
            if (transaction != null)
                transaction.rollback();
        }
    }
}
