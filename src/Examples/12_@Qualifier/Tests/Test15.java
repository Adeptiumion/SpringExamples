package Tests;

import Data4.OtherClasses.Person11;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("Data4/Resources/applicationContext12.xml");

        Person11 person = context.getBean("person11", Person11.class);
        person.callYourPet();

        context.close();

    }
}
