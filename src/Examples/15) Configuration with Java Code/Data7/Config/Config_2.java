package Data7.Config;


import Data7.Classes.Case_2.Car;
import Data7.Classes.Case_2.Engine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.logging.Logger;

@Configuration
@PropertySource("classpath:Resources/values.properties")
public class Config_2 {
    private Logger log = Logger.getLogger("BeanWatcher");

    @Bean
    @Scope("singleton")
    public Engine engine(){ // id Bean = engine
        log.info("First making engine...");
        return new Engine();
    }

    @Bean
    @Scope("singleton")
    public Car car(){
        log.info("First making car...");
        return new Car(engine());
    }


}
