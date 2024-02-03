package Tests;

import Entity.DetailsOfPlayer;
import Entity.Player;
import Interfaces_of_annotations.UniDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToOneUniDirectional2 {

    @UniDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("relationships_between_players_and_their_statistics");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(Player.class, DetailsOfPlayer.class)).openSession()) {
            transaction = session.beginTransaction();
            Player player = session.get(Player.class,4);
            System.out.println(player);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
