package Data2.Animals;


import Data2.Interfaces.Pet10;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Cat10 implements Pet10 {

    private static Logger log  = Logger.getLogger(Cat10.class.getName());
    private String name;

    public Cat10(){
        log.info("Cat10 bean is created!");
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
