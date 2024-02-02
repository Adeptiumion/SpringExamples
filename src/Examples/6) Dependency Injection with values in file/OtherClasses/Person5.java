package OtherClasses;

import Interfaces_of_annotations.Pet6;

import java.util.logging.Logger;

public class Person5 {
    private Pet6 pet;
    private String surname;
    private int age;
    private static Logger log = Logger.getLogger(Person5.class.getName());

    public Person5(Pet6 pet) {
        this.pet = pet;
        log.info("Person5 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person5(){

    }

    // setPet5 -> pet5
    public void setPet6(Pet6 pet) {
        log.info("Class Person5: set pet!");
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
        return "Person5{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
