package Tests;

import Entity.Developer;
import Entity.DevelopmentTeam;
import Interfaces_of_annotations.BiDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToManyBiDirectional {
    @BiDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("developers_relationship");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Developer.class,
                DevelopmentTeam.class
        )).openSession()) {
            transaction = session.beginTransaction();
            DevelopmentTeam developmentTeam =
                    new DevelopmentTeam("Sber", 500_000, 60_000);
            Developer developer_1 = new Developer("Nikita", "Udakov", 60_000);
            Developer developer_2 = new Developer("Gleb", "Pechenkin", 80_000);
            developmentTeam.addDeveloper(developer_1);
            developmentTeam.addDeveloper(developer_2);
            session.persist(developmentTeam);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
