package Data6.Animals;


import Data6.Interfaces.Pet14;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;


@Component
@Scope("singleton")
public class Dog14 implements Pet14 {
    private String name;

    private static Logger log = Logger.getLogger(Dog14.class.getName());


    public Dog14() {
        log.info("Dog14 bean is created!");
    }

    @Override
    public void say() {
        System.out.println("Bow-bow");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    @PostConstruct
    public void init() {
        log.info("Class Dog14: init method.");
    }

    // Модификаторы доступа метода не ограничивают его в использовании!
    @PreDestroy
    public void destroy() {
        log.info("Class Dog14: destroy method.");
    }

}
