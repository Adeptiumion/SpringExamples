package Data4.Animals;




import Data4.Interfaces.Pet12;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Cat12 implements Pet12 {

    private static Logger log  = Logger.getLogger(Cat12.class.getName());
    private String name;

    public Cat12(){
        log.info("Cat12 bean is created!");
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
