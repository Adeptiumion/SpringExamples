package Tests;

import Entity.Developer;
import Entity.DevelopmentTeam;
import Interfaces_of_annotations.BiDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.logging.Logger;

public class TestEagerAndLazy2 {

    private static final Logger testEagerAndLazy2Logger = Logger.getLogger(TestEagerAndLazy2.class.getName());
    @BiDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("developers_relationship");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Developer.class,
                DevelopmentTeam.class
        )).openSession()) {
            transaction = session.beginTransaction();
            DevelopmentTeam devTeam = session.get(DevelopmentTeam.class, 2);
            System.out.println("Show development team: ");

            // Я не ебу в hibernate версии этого проекта и без этого после коммита грузит.... ????
            testEagerAndLazy2Logger.info("Подгружаю работников до конца сессии");
            devTeam.getDeveloperList().get(0);

            System.out.println(devTeam);
            transaction.commit();

            System.out.println("Show developers in team: ");
            System.out.println(devTeam.getDeveloperList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
