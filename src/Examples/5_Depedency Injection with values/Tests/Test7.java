package Tests;

import OtherClasses.Person;
import OtherClasses.Person2;
import OtherClasses.Person3;
import OtherClasses.Person4;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext5.xml");

        Person4 person4 = context.getBean("Person4", Person4.class);
        person4.callYourPet();

        context.close(); // Не забывай закрывать контекст.

    }
}