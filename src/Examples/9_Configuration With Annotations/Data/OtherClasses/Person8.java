package Data.OtherClasses;




import Data.Interfaces.Pet9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("Person8bean")
public class Person8 {
    private Pet9 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person8.class.getName());

    @Autowired // Если конструктор 1, То @Autowired будет применен к конструктору неявно, без его прописи.
    public Person8(Pet9 pet) {
        this.pet = pet;
        log.info("Person8 bean is created!");
    }


    public void setPet9(Pet9 pet) {
        log.info("Class Person7: set pet!");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    @Override
    public String toString() {
        return "Person8{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
