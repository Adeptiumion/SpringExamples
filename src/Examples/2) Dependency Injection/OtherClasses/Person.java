package OtherClasses;

import Interfaces_of_annotations.Pet2;

public class Person {
    private Pet2 pet;

    public Person(Pet2 pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
