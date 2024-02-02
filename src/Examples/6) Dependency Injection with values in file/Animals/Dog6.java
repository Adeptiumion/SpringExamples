package Animals;

import Interfaces_of_annotations.Pet6;

import java.util.logging.Logger;

public class Dog6 implements Pet6 {

    private static Logger log  = Logger.getLogger(Dog6.class.getName());

    public Dog6(){
        log.info("Dog6 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }
}
