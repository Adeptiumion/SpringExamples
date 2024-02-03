package Tests;

import Data2.OtherClasses.Person9;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test13 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("Data2/Resources/applicationContext10.xml");

        Person9 person = context.getBean("person9", Person9.class);
        person.callYourPet();

        context.close();

    }
}
