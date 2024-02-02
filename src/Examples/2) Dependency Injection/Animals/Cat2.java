package Animals;

import Interfaces_of_annotations.Pet2;

public class Cat2 implements Pet2 {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
