package Animals;

import Interfaces_of_annotations.Pet7;

import java.util.logging.Logger;

public class Cat7 implements Pet7 {

    private static Logger log  = Logger.getLogger(Cat7.class.getName());
    private String name;

    public Cat7(){
        log.info("Cat7 bean is created!");
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
