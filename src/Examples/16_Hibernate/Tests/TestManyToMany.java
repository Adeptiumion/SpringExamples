package Tests;

import Entity.Child;
import Entity.Section;
import Interfaces_of_annotations.ManyToManyCase;
import Util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@ManyToManyCase
public class TestManyToMany {
    public static void main(String[] args) {
        Util.setUrl("many_to_many");
        Transaction transaction = null;
        try(Session session = Util.getSessionFactory(List.of(Child.class, Section.class)).openSession()){
            transaction = session.beginTransaction();


            // Для корректного сейва при CascadeType = все кроме ремув надо:
            // cascade = {
            // CascadeType.DETACH,
            // CascadeType.MERGE,
            // CascadeType.PERSIST,
            // CascadeType.REFRESH
            // }
            // Причем в обоих классах! и юзать persist вместо save.



            Section section_1 = new Section("Самбо");
            Child child_1 = new Child("Спиногрыз_1", 9);
            Child child_2 = new Child("Спиногрыз_2", 8);
            Child child_3 = new Child("Спиногрыз_3", 10);
            section_1.addChildToSection(child_1);
            section_1.addChildToSection(child_2);
            section_1.addChildToSection(child_3);
            session.persist(section_1);

            Section section_football = new Section("Футбол");
            Section section_literball = new Section("Литрбол");
            Section section_Valorant_eSport = new Section("Валорант киберспорт");
            Child child_potokovskiy = new Child("Гопа", 11);
            child_potokovskiy.addSectionToChild(section_football);
            child_potokovskiy.addSectionToChild(section_literball);
            child_potokovskiy.addSectionToChild(section_Valorant_eSport);
            session.persist(child_potokovskiy);


            transaction.commit();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
