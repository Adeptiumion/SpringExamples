package Tests;

import Animals.Cat;
import Animals.Dog;
import Interfaces_of_annotations.Pet2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext.xml");

        Pet2 dog = context.getBean("Dog", Dog.class); // Либо рефлексируй
        Pet2 cat = (Cat) context.getBean("Cat"); // Либо касти
        dog.say();
        cat.say();

        context.close(); // Не забывай закрывать контекст.

    }
}
