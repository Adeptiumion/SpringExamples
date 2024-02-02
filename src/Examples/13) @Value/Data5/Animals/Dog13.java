package Data5.Animals;




import Data5.Interfaces.Pet13;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Dog13 implements Pet13 {

    private static Logger log  = Logger.getLogger(Dog13.class.getName());


    public Dog13(){
        log.info("Dog13 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void init(){
        log.info("Class Dog13: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void destroy(){
        log.info("Class Dog13: destroy method.");
    }

}
