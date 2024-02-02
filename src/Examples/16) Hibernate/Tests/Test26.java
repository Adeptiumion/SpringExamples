package Tests;

import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test26 {

    // Изменение нескольких Entity
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory().openSession()){
            transaction = session.beginTransaction();

            session.createQuery("update Employee set salary = 2100 where department = 'Middle+ developer'")
                    .executeUpdate();

            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
