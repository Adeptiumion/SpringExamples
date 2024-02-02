package Animals;

import Interfaces_of_annotations.Pet3;

import java.util.logging.Logger;

public class Dog3 implements Pet3 {

    private static Logger log  = Logger.getLogger(Dog3.class.getName());

    public Dog3(){
        log.info("Dog3 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }
}
