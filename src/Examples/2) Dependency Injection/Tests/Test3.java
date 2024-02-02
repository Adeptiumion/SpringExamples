package Tests;

import Animals.Cat2;
import OtherClasses.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext2.xml");

        Person person  = new Person(new Cat2());
        person.callYourPet();

        context.close(); // Не забывай закрывать контекст.

    }
}
