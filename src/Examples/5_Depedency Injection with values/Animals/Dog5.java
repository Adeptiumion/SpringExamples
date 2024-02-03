package Animals;

import Interfaces_of_annotations.Pet5;

import java.util.logging.Logger;

public class Dog5 implements Pet5 {

    private static Logger log  = Logger.getLogger(Dog5.class.getName());

    public Dog5(){
        log.info("Dog5 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }
}
