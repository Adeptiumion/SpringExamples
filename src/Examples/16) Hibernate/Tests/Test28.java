package Tests;

import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test28 {
    public static void main(String[] args) {
        Transaction transaction = null;
        try(Session session = Util.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.createQuery("delete Employee where id > 2 and id < 6")
                    .executeUpdate();
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            e.getCause();
        }
    }
}
