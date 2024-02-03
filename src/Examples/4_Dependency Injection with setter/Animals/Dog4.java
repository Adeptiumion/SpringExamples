package Animals;

import Interfaces_of_annotations.Pet4;

import java.util.logging.Logger;

public class Dog4 implements Pet4 {

    private static Logger log  = Logger.getLogger(Dog4.class.getName());

    public Dog4(){
        log.info("Dog4 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }
}
