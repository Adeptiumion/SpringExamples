package Data5.OtherClasses;


import Data5.Interfaces.Pet13;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Person12 {

    private Pet13 pet;

    @Value("Alice")
    private String surname;
    @Value("18")
    private int age;
    @Value("${person.lastname}")
    private String lastname;
    private static Logger log = Logger.getLogger(Person12.class.getName());

    @Autowired
    public Person12(@Qualifier("cat13") Pet13 pet) {
        this.pet = pet;
        log.info("Person12 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person12(){

    }


    public void setPet13(Pet13 pet) {
        log.info("Class Person12: set pet!");
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
        return "Person12{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
