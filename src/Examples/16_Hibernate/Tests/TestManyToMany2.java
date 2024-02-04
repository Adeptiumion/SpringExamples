package Tests;

import Entity.Child;
import Entity.Section;
import Interfaces_of_annotations.ManyToManyCase;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@ManyToManyCase
public class TestManyToMany2 {
    public static void main(String[] args) {
        Util.setUrl("many_to_many");
        Transaction transaction = null;
        try(Session session = Util.getSessionFactory(List.of(Child.class, Section.class)).openSession()){
            transaction = session.beginTransaction();

            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildrens());
            transaction.commit();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
