package Tests;

import Data7.Classes.Case_1.Gamer;
import Data7.Config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test18 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Gamer gamer = context.getBean("gamer", Gamer.class);
        System.out.println(gamer);
        context.close();
    }
}
