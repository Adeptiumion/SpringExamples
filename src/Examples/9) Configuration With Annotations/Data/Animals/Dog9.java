package Data.Animals;


import Data.Interfaces.Pet9;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


public class Dog9 implements Pet9 {

    private static Logger log  = Logger.getLogger(Dog9.class.getName());


    public Dog9(){
        log.info("Dog9 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void init(){
        log.info("Class Dog9: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void destroy(){
        log.info("Class Dog9: destroy method.");
    }

}
