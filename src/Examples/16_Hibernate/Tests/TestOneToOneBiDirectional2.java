package Tests;

import Entity.Characteristics;
import Entity.DetailsOfPlayer;
import Entity.Weapon;
import Interfaces_of_annotations.BiDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collector;

public class TestOneToOneBiDirectional2 {
    private static final Logger testOneToOneBiDirectional2Logger =
            Logger.getLogger(TestOneToOneBiDirectional2.class.getName());
    @BiDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("relationship_between_a_weapon_and_its_characteristics");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(Weapon.class, Characteristics.class)).openSession()){
            transaction = session.beginTransaction();

            Characteristics characteristics = session.get(Characteristics.class, 2);
            System.out.println(characteristics.getWeapon());
            session.remove(characteristics);

            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            testOneToOneBiDirectional2Logger.severe("Message: " + e.getMessage());
        }
    }
}
