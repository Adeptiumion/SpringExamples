package Data3.OtherClasses;


import Data3.Interfaces.Pet11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Person10 {
    @Autowired
    private Pet11 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person10.class.getName());

    public Person10(Pet11 pet) {
        this.pet = pet;
        log.info("Person10 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person10(){

    }

    public void setPet11(Pet11 pet) {
        log.info("Class Person10: set pet!");
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
        return "Person10{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
