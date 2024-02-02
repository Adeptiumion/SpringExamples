package Tests;

import Animals.Cat7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Resources/applicationContext7.xml");

        Cat7 cat_1 = context.getBean("Cat7", Cat7.class);
        Cat7 cat_2 = context.getBean("Cat7", Cat7.class);

        // Т.к. Scope = prototype, то будет false.
        System.out.println("Переменные ссылаются на один и тот же объект? " + (cat_1 == cat_2));
        System.out.println(cat_1);
        System.out.println(cat_2);

        cat_1 = null;
        cat_2 = null;

        Cat7 myCat = context.getBean("Cat7", Cat7.class);
        myCat.setName("Twix");
        Cat7 yourCat = context.getBean("Cat7", Cat7.class);
        yourCat.setName("Zhora");

        System.out.println(yourCat.getName());
        System.out.println(myCat.getName());

        context.close();

    }
}
