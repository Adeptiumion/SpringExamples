package Data6.Animals;






import Data6.Interfaces.Pet14;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
public class Cat14 implements Pet14 {

    private static Logger log  = Logger.getLogger(Cat14.class.getName());
    private String name;

    public Cat14(){
        log.info("Cat14 bean is created!");
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
