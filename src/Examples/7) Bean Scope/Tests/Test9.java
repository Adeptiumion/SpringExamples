package Tests;

import Animals.Dog7;
import OtherClasses.Person;
import OtherClasses.Person2;
import OtherClasses.Person3;
import OtherClasses.Person4;
import OtherClasses.Person5;
import OtherClasses.Person6;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Resources/applicationContext7.xml");

        Dog7 dog_1 = context.getBean("Dog7", Dog7.class);
        Dog7 dog_2 = context.getBean("Dog7", Dog7.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (dog_1 == dog_2));
        System.out.println(dog_1);
        System.out.println(dog_2);

        dog_1 = null;
        dog_2 = null;

        Dog7 myDog = context.getBean("Dog7", Dog7.class);
        myDog.setName("Belka");
        Dog7 yourDog = context.getBean("Dog7", Dog7.class);
        myDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());



        context.close(); // Не забывай закрывать контекст.

    }
}