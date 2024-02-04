package Tests;

import Entity.Child;
import Entity.Section;
import Interfaces_of_annotations.ManyToManyCase;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@ManyToManyCase
public class TestManyToMany3 {
    public static void main(String[] args) {
        Util.setUrl("many_to_many");
        Transaction transaction = null;
        try (Session session = Util.getSessionFactory(List.of(Child.class, Section.class)).openSession()) {
            transaction = session.beginTransaction();
            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
