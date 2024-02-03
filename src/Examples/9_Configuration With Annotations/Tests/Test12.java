package Tests;


import Data.OtherClasses.Person8;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Data/Resources/applicationContext9.xml");

        Person8 person = context.getBean("Person8bean", Person8.class);
        person.callYourPet();

        context.close();

    }
}
