package Animals;

import Interfaces_of_annotations.Pet5;

import java.util.logging.Logger;

public class Cat5 implements Pet5 {

    private static Logger log  = Logger.getLogger(Cat5.class.getName());

    public Cat5(){
        log.info("Cat5 bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
