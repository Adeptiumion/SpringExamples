package Animals;

import Interfaces_of_annotations.Pet2;

public class Dog implements Pet2 {
    @Override
    public void say(){
        System.out.println("Bow-bow");
    }
}
