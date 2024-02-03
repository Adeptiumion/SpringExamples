package Tests;

import Animals.Cat;
import Animals.Dog;
import Interfaces_of_annotations.Pet2;

public class Test1 {
    public static void main(String[] args) {
        Pet2 dog = new Dog();
        dog.say();
        Pet2 cat = new Cat();
        cat.say();
    }
}
