package Data2.Animals;

import Data2.Interfaces.Pet10;

import java.util.logging.Logger;

public class Dog10 implements Pet10 {

    private static Logger log  = Logger.getLogger(Dog10.class.getName());


    public Dog10(){
        log.info("Dog10 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void init(){
        log.info("Class Dog10: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void destroy(){
        log.info("Class Dog10: destroy method.");
    }

}
