package Entity;

import Interfaces_of_annotations.UniDirectional;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nickname")
    private String nickname;
    @Column(name="platform")
    private String platform;
    @Column(name="hours_in_game")
    private int hoursInGame;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    @UniDirectional(autor = "Danil Gorev")
    private DetailsOfPlayer detailsOfPlayer;

    public Player(){}

    public Player(String nickname, String platform, int hoursInGame) {
        this.nickname = nickname;
        this.platform = platform;
        this.hoursInGame = hoursInGame;
    }

    public DetailsOfPlayer getDetailsOfPlayer() {
        return detailsOfPlayer;
    }

    public void setDetailsOfPlayer(DetailsOfPlayer detailsOfPlayer) {
        this.detailsOfPlayer = detailsOfPlayer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getHoursInGame() {
        return hoursInGame;
    }

    public void setHoursInGame(int hoursInGame) {
        this.hoursInGame = hoursInGame;
    }

    @Override
    public String toString() {
        return "Player with id: "
                + getId()
                + "\n nickname: " + getNickname()
                + "\n platform: " + getPlatform()
                + "\n hours in game: " + getHoursInGame()
                + "\n\n" + getDetailsOfPlayer();
    }
}
