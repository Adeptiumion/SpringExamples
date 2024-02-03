package Animals;


import Interfaces_of_annotations.Pet8;

import java.util.logging.Logger;

public class Cat8 implements Pet8 {

    private static Logger log  = Logger.getLogger(Cat8.class.getName());
    private String name;

    public Cat8(){
        log.info("Cat8 bean is created!");
    }
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
