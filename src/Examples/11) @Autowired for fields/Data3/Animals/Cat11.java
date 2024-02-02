package Data3.Animals;



import Data3.Interfaces.Pet11;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Cat11 implements Pet11 {

    private static Logger log  = Logger.getLogger(Cat11.class.getName());
    private String name;

    public Cat11(){
        log.info("Cat11 bean is created!");
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
