package Tests;

import Animals.Dog8;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("Resources/applicationContext8.xml");
        Dog8 dog = (Dog8) context.getBean("Dog8");
        dog.say();
        context.close();

    }
}
