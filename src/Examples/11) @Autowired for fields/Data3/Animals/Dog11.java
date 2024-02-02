package Data3.Animals;

import Data3.Interfaces.Pet11;

import java.util.logging.Logger;

public class Dog11 implements Pet11 {

    private static Logger log  = Logger.getLogger(Dog11.class.getName());


    public Dog11(){
        log.info("Dog11 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void init(){
        log.info("Class Dog11: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void destroy(){
        log.info("Class Dog11: destroy method.");
    }

}
