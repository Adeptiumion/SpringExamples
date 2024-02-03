package Data4.OtherClasses;


import Data4.Interfaces.Pet12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Person11 {
//  @Autowired
//  @Qualifier("cat12")
    private Pet12 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person11.class.getName());

    @Autowired
    public Person11(@Qualifier("cat12") Pet12 pet) {
        this.pet = pet;
        log.info("Person11 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person11(){

    }

//  @Autowired
//  @Qualifier("dog12")
    public void setPet12(Pet12 pet) {
        log.info("Class Person11: set pet!");
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
        return "Person11{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
