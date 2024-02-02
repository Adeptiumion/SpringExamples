package Data7.Classes.Case_1;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Account {
    private int id;
    private int login;
    private int password;

    private Logger log = Logger.getLogger(Account.class.getName());

    public Account(){
        log.info("Account bean is created!");
    }


}
