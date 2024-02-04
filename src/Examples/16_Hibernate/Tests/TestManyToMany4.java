package Tests;

import Entity.Child;
import Entity.Section;
import Interfaces_of_annotations.ManyToManyCase;
import Util.Util;
import jakarta.persistence.CascadeType;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@ManyToManyCase
public class TestManyToMany4 {
    public static void main(String[] args) {
        Util.setUrl("many_to_many");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(Child.class, Section.class)).openSession()) {
            transaction = session.beginTransaction();

            Section section = session.get(Section.class, 1);
            session.remove(section); // для корректного ремува надо:
            // cascade = {
            // CascadeType.DETACH,
            // CascadeType.MERGE,
            // CascadeType.PERSIST,
            // CascadeType.REFRESH
            // }
            // Причем в обоих классах!

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}