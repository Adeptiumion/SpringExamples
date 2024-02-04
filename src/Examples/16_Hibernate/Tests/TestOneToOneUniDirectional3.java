package Tests;

import Entity.DetailsOfPlayer;
import Entity.Player;
import Interfaces_of_annotations.UniDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToOneUniDirectional3 {
    @UniDirectional(autor = "danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("relationships_between_players_and_their_statistics");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(Player.class, DetailsOfPlayer.class)).openSession()) {
            transaction = session.beginTransaction();
            session.createQuery("from Player", Player.class).getResultList().forEach(System.out::println);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
