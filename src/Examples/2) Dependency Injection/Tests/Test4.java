package Tests;


import Animals.Dog2;
import Interfaces_of_annotations.Pet2;
import OtherClasses.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext2.xml");

        Pet2 pet = context.getBean("Dog2", Dog2.class);
        Person person = new Person(pet);
        person.callYourPet();

        context.close(); // Не забывай закрывать контекст.

    }
}