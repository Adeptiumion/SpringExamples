package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "details")
public class DetailsOfPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "game_name")
    private String gameName;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "is_multiplayer")
    private boolean isMultiplayer;
    @Column(name = "is_ranked")
    private boolean isRanked;
    @Column(name = "is_eSport")
    private boolean iseSport;

    public DetailsOfPlayer() {
    }

    public DetailsOfPlayer(int id, String gameName, String publisher, boolean isMultiplayer, boolean isRanked, boolean iseSport) {
        this.id = id;
        this.gameName = gameName;
        this.publisher = publisher;
        this.isMultiplayer = isMultiplayer;
        this.isRanked = isRanked;
        this.iseSport = iseSport;
    }

    public DetailsOfPlayer(String gameName, String publisher, boolean isMultiplayer, boolean isRanked, boolean iseSport) {
        this.gameName = gameName;
        this.publisher = publisher;
        this.isMultiplayer = isMultiplayer;
        this.isRanked = isRanked;
        this.iseSport = iseSport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean getIsMultiplayer() {
        return isMultiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        isMultiplayer = multiplayer;
    }

    public boolean getIsRanked() {
        return isRanked;
    }

    public void setRanked(boolean ranked) {
        isRanked = ranked;
    }

    public boolean getIsIseSport() {
        return iseSport;
    }

    public void setIseSport(boolean iseSport) {
        this.iseSport = iseSport;
    }

    @Override
    public String toString() {
        return "Details of player with id: "
                + id
                + "\n game name: " + getGameName()
                + "\n publisher: " + getPublisher()
                + "\n is multiplayer?: " + getIsMultiplayer()
                + "\n is ranked?: " + getIsRanked()
                + "\n is eSport?: " + getIsIseSport();
    }
}
