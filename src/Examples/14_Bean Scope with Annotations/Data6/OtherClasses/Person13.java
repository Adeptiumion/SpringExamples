package Data6.OtherClasses;


import Data6.Interfaces.Pet14;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Person13 {

    private Pet14 pet;

//  @Value("Alice")
    private String surname;
//  @Value("18")
    private int age;
//  @Value("${person.lastname}")
    private String lastname;
    private static Logger log = Logger.getLogger(Person13.class.getName());

    @Autowired
    public Person13(@Qualifier("cat14") Pet14 pet) {
        this.pet = pet;
        log.info("Person13 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person13(){

    }


    public void setPet14(Pet14 pet) {
        log.info("Class Person13: set pet!");
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
        return "Person13{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
