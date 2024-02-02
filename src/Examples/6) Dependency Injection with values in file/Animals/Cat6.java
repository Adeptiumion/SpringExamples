package Animals;

import Interfaces_of_annotations.Pet6;

import java.util.logging.Logger;

public class Cat6 implements Pet6 {

    private static Logger log  = Logger.getLogger(Cat6.class.getName());

    public Cat6(){
        log.info("Cat6 bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
