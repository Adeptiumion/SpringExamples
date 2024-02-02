package Tests;

import OtherClasses.Person;
import OtherClasses.Person2;
import OtherClasses.Person3;
import OtherClasses.Person4;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext5.xml");

        Person4 person = context.getBean("Person4", Person4.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        System.out.println();
        System.out.println(person);

        context.close(); // Не забывай закрывать контекст.

    }
}