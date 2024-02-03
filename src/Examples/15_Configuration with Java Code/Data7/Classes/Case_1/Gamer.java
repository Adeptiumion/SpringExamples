package Data7.Classes.Case_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Gamer {


    private String nickname;

    private int mmr;

    private Account account;

    private Logger log = Logger.getLogger(Gamer.class.getName());

    @Autowired
    public Gamer(@Value("Adept")String nickname, @Value("2130")int mmr, Account account) {
        this.nickname = nickname;
        this.mmr = mmr;
        this.account = account;
        log.info("Gamer bean is created!");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMmr() {
        return mmr;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", mmr=" + mmr +
                ", account=" + account +
                '}';
    }
}
