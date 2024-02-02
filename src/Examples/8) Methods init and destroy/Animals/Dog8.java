package Animals;

import Interfaces_of_annotations.Pet8;

import java.util.logging.Logger;

public class Dog8 implements Pet8 {

    private static Logger log  = Logger.getLogger(Dog8.class.getName());


    public Dog8(){
        log.info("Dog8 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void init(){
        log.info("Class Dog8: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    public void destroy(){
        log.info("Class Dog8: destroy method.");
    }

}
