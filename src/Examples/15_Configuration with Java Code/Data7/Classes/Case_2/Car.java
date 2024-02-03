package Data7.Classes.Case_2;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.logging.Logger;

public class Car {
    @Value("${Car.company}")
    private String company;
    @Value(("${Car.model}"))
    private String model;
    private Engine engine;

    private Logger log = Logger.getLogger(Car.class.getName());


    public Car(String company, String model, Engine engine, Date date) {
        this.company = company;
        this.model = model;
        this.engine = engine;
        log.info("car bean with full arguments is created!");
    }

    public Car(Engine engine){
        this.engine = engine;
        log.info("car bean with 1 argument in constructor is created!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
