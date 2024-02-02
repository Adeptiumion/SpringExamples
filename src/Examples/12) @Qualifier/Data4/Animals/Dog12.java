package Data4.Animals;



import Data4.Interfaces.Pet12;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Dog12 implements Pet12 {

    private static Logger log  = Logger.getLogger(Dog12.class.getName());


    public Dog12(){
        log.info("Dog12 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void init(){
        log.info("Class Dog12: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void destroy(){
        log.info("Class Dog12: destroy method.");
    }

}
