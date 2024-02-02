package OtherClasses;

import Interfaces_of_annotations.Pet4;
import java.util.logging.Logger;

public class Person3 {
    private Pet4 pet;
    private static Logger log = Logger.getLogger(Person3.class.getName());

    public Person3(Pet4 pet) {
        this.pet = pet;
        log.info("Person3 bean is created!");
    }

    // При подключении зависимости через сеттер нужен конструктор по-умолчанию!
    public Person3(){

    }

    // setPet3 -> pet3
    public void setPet4(Pet4 pet) {
        log.info("Class Person3: set pet!");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
