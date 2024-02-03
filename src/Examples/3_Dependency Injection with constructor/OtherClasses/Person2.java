package OtherClasses;

import Animals.Dog3;
import Interfaces_of_annotations.Pet3;

import java.util.logging.Logger;

public class Person2 {
    private Pet3 pet;
    private static Logger log  = Logger.getLogger(Dog3.class.getName());

    public Person2(Pet3 pet){
        this.pet = pet;
        log.info("Person2 bean is created!");
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
