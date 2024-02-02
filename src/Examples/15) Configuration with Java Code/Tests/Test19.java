package Tests;

import Data7.Classes.Case_2.Car;
import Data7.Classes.Case_2.Engine;
import Data7.Config.Config_2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test19 {
    public static void main(String[] args) {
             AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(Config_2.class);

        Engine engine = context.getBean("engine", Engine.class);
        Engine engine2 = context.getBean("engine", Engine.class);
        engine.voice();
        engine2.voice();

        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        context.close();

    }
}
