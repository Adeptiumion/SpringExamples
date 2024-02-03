package Data7.Classes.Case_2;

import org.springframework.beans.factory.annotation.Value;

import java.util.logging.Logger;

public class Engine {
    @Value("300")
    private int horsepower;
    private Logger log = Logger.getLogger(Engine.class.getName());
    public Engine(int horsepower){
        this.horsepower = horsepower;
    }

    public Engine(){
        log.info("engine bean is created!");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


    public void voice(){
        System.out.println("Wrum-wrum, Motherfucker!");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                '}';
    }
}
