package Data5.Animals;





import Data5.Interfaces.Pet13;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Cat13 implements Pet13 {

    private static Logger log  = Logger.getLogger(Cat13.class.getName());
    private String name;

    public Cat13(){
        log.info("Cat13 bean is created!");
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
