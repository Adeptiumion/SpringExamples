package Tests;

import Entity.Characteristics;
import Entity.Weapon;
import Interfaces_of_annotations.BiDirectional;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TestOneToOneBiDirectional {
    @BiDirectional(autor = "Danil Gorev")
    public static void main(String[] args) {
        Util.setUrl("relationship_between_a_weapon_and_its_characteristics");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(
                Weapon.class,
                Characteristics.class
        )).openSession()){
            transaction = session.beginTransaction();
            Weapon weapon = new Weapon("AK-47");
            Characteristics characteristics = new Characteristics("assault rifle", "Russia");
            weapon.setCharacteristics(characteristics);
            session.persist(weapon);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

    }
}
