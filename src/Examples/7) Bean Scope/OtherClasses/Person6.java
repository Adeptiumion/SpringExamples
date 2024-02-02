package OtherClasses;

import Interfaces_of_annotations.Pet7;

import java.util.logging.Logger;

public class Person6 {
    private Pet7 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person6.class.getName());

    public Person6(Pet7 pet) {
        this.pet = pet;
        log.info("Person6 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person6(){

    }


    public void setPet7(Pet7 pet) {
        log.info("Class Person6: set pet!");
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
        return "Person6{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
