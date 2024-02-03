package Data.Animals;


import Data.Interfaces.Pet9;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("Cat9bean")
public class Cat9 implements Pet9 {

    private static Logger log  = Logger.getLogger(Cat9.class.getName());
    private String name;

    public Cat9(){
        log.info("Cat9 bean is created!");
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
