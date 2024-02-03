package Animals;

import Interfaces_of_annotations.Pet4;

import java.util.logging.Logger;

public class Cat4 implements Pet4 {

    private static Logger log  = Logger.getLogger(Cat4.class.getName());

    public Cat4(){
        log.info("Cat4 bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
