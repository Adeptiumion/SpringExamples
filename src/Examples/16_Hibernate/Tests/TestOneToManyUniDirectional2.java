package Tests;

import Entity.Bardel;
import Entity.Whore;
import Interfaces_of_annotations.UniDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToManyUniDirectional2 {
    @UniDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("prostitution");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Whore.class,
                Bardel.class
        )).openSession()) {
            transaction = session.beginTransaction();
            Bardel bardel = session.get(Bardel.class, 1);
            System.out.println(bardel.getWhoresList());
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
