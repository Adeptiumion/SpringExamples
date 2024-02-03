package OtherClasses;

import Interfaces_of_annotations.Pet5;

import java.util.logging.Logger;

public class Person4 {
    private Pet5 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person4.class.getName());

    public Person4(Pet5 pet) {
        this.pet = pet;
        log.info("Person4 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person4(){

    }

    // setPet4 -> pet4
    public void setPet5(Pet5 pet) {
        log.info("Class Person4: set pet!");
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
        return "Person4{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
