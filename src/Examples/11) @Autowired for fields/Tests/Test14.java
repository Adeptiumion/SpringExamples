package Tests;

import Data3.OtherClasses.Person10;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test14 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("Data3/Resources/applicationContext11.xml");

        Person10 person = context.getBean("person10", Person10.class);
        person.callYourPet();

        context.close();

    }
}
