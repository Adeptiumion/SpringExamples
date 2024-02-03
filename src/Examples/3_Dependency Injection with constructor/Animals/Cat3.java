package Animals;

import Interfaces_of_annotations.Pet3;

import java.util.logging.Logger;

public class Cat3 implements Pet3 {

    private static Logger log  = Logger.getLogger(Cat3.class.getName());

    public Cat3(){
        log.info("Cat3 bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
