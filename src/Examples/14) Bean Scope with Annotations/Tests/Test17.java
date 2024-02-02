package Tests;

import Animals.Cat7;
import Data6.Animals.Cat14;
import Data6.Animals.Dog14;
import Data6.OtherClasses.Person13;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test17 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("Data6/Resources/applicationContext14.xml");

        Dog14 yourDog = context.getBean("dog14", Dog14.class);
        yourDog.setName("Spike");
        Dog14 myDog = context.getBean("dog14", Dog14.class);
        yourDog.setName("Bobik");

        System.out.println();
        System.out.println(yourDog.getName());
        System.out.println(myDog.getName());
        System.out.println();

        // Т.к. Scope = prototype, то будет false.
        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        myDog = null;
        yourDog = null;

        Cat14 myCat = context.getBean("cat14", Cat14.class);
        myCat.setName("Twix");
        Cat14 yourCat = context.getBean("cat14", Cat14.class);
        yourCat.setName("Zhora");

        System.out.println();
        System.out.println(yourCat.getName());
        System.out.println(myCat.getName());
        System.out.println();

        System.out.println("Переменные ссылаются на один и тот же объект? " + (yourCat == myCat));
        System.out.println(myCat);
        System.out.println(yourCat);

        context.close();


    }
}
