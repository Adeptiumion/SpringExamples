package Tests;

import Data5.OtherClasses.Person12;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test16 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("Data5/Resources/applicationContext13.xml");

        Person12 person = context.getBean("person12", Person12.class);
        System.out.println(person);

        context.close();

    }
}
