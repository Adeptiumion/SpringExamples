package Tests;

import Entity.Developer;
import Entity.DevelopmentTeam;
import Interfaces_of_annotations.BiDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToManyBiDirectional2 {
    @BiDirectional
    public static void main(String[] args) {
        Util.setUrl("developers_relationship");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Developer.class,
                DevelopmentTeam.class
        )).openSession()) {
            transaction = session.beginTransaction();
            DevelopmentTeam devTeam = session.get(DevelopmentTeam.class, 1);
            System.out.println(devTeam);
            System.out.println();
            devTeam.getDeveloperList().forEach(System.out::println);
            System.out.println("\n\n\n");
            Developer developer = session.get(Developer.class, 2);
            System.out.println(developer);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
