package Tests;

import Entity.DetailsOfPlayer;
import Entity.Player;
import Interfaces_of_annotations.UniDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToOneUniDirectional {
    @UniDirectional
    public static void main(String[] args) {
        Util.setUrl("relationships_between_players_and_their_statistics");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(Player.class, DetailsOfPlayer.class)).openSession()) {
            transaction = session.beginTransaction();
            Player player = new Player("Arnogos", "Riot launcher", 5000);
            DetailsOfPlayer detailsOfPlayer = new DetailsOfPlayer(
                    "League of legends",
                    "Riot Games",
                    true,
                    true,
                    true

            );
            player.setDetailsOfPlayer(detailsOfPlayer);

            session.persist(player);

            transaction.commit();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
