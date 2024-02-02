package Tests;

import OtherClasses.Person;
import OtherClasses.Person2;
import OtherClasses.Person3;
import OtherClasses.Person4;
import OtherClasses.Person5;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext6.xml");

        Person5 person5 = context.getBean("Person5", Person5.class);
        System.out.println(person5);

        context.close(); // Не забывай закрывать контекст.

    }
}