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

            // Неправильное двухсторонее сохранение:
            Weapon weapon = new Weapon("AK-47");
            Characteristics characteristics = new Characteristics("assault rifle", "Russia");
            characteristics.setWeapon(weapon);
            session.persist(characteristics);

            // Правильное двухсторонее сохранение:
            Weapon weapon_2 = new Weapon("M4A1-S");
            Characteristics characteristics_2 = new Characteristics("assault rifle", "USA");
            characteristics_2.setWeapon(weapon_2);
            weapon_2.setCharacteristics(characteristics_2);
            session.persist(characteristics_2);

            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

    }
}
