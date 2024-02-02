package Animals;

import Interfaces_of_annotations.Pet7;

import java.util.logging.Logger;

public class Dog7 implements Pet7 {

    private static Logger log  = Logger.getLogger(Dog7.class.getName());
    private String name;

    public Dog7(){
        log.info("Dog7 bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
