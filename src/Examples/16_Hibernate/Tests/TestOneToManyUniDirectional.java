package Tests;

import Entity.Bardel;
import Entity.Developer;
import Entity.DevelopmentTeam;
import Entity.Whore;
import Interfaces_of_annotations.BiDirectional;
import Interfaces_of_annotations.UniDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToManyUniDirectional {
    @UniDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("prostitution");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Whore.class,
                Bardel.class
        )).openSession()) {
            transaction = session.beginTransaction();
            Bardel bardel = new Bardel("Korolenko 14 street", 120_000, 50_000);
            Whore whore_1 = new Whore("Сюзана", "Анальная пружина", 52_000);
            Whore whore_2 = new Whore("Анжелла", "Королева золотого дождя", 53_100);
            bardel.addWhore(whore_1);
            bardel.addWhore(whore_2);
            session.persist(bardel);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
