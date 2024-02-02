package Data2.OtherClasses;


import Data2.Interfaces.Pet10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Person9 {
    private Pet10 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person9.class.getName());

    public Person9(Pet10 pet) {
        this.pet = pet;
        log.info("Person9 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person9(){

    }


    @Autowired
    public void setPet10(Pet10 pet) {
        log.info("Class Person9: set pet!");
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
        return "Person9{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
