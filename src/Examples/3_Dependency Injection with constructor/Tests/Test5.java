package Tests;

import OtherClasses.Person;
import OtherClasses.Person2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext3.xml");

        Person2 person = context.getBean("Person2", Person2.class);
        person.callYourPet();

        context.close(); // Не забывай закрывать контекст.

    }
}