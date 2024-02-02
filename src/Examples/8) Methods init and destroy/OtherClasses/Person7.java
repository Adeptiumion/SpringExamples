package OtherClasses;


import Interfaces_of_annotations.Pet8;

import java.util.logging.Logger;

public class Person7 {
    private Pet8 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person7.class.getName());

    public Person7(Pet8 pet) {
        this.pet = pet;
        log.info("Person6 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person7(){

    }


    public void setPet8(Pet8 pet) {
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
        return "Person7{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
