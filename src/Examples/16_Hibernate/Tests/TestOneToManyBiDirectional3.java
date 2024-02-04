package Tests;

import Entity.Developer;
import Entity.DevelopmentTeam;
import Interfaces_of_annotations.BiDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToManyBiDirectional3 {
    @BiDirectional
    public static void main(String[] args) {
        Util.setUrl("developers_relationship");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Developer.class,
                DevelopmentTeam.class
        )).openSession()) {
            transaction = session.beginTransaction();
            Developer developer = session.get(Developer.class, 1);
            session.remove(developer);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
