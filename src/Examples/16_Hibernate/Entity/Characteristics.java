package Entity;

import Interfaces_of_annotations.BiDirectional;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="characteristics")
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name="country")
    private String country;
    @OneToOne(mappedBy = "characteristics", cascade = CascadeType.ALL)
    @BiDirectional(autor = "Danil Gorev")
    private Weapon weapon;

    public Characteristics(){}

    public Characteristics(String type, String country) {
        this.type = type;
        this.country = country;
    }

    public Characteristics(int id, String type, String country, Weapon weapon) {
        this.id = id;
        this.type = type;
        this.country = country;
        this.weapon = weapon;
    }

    public Characteristics(String type, String country, Weapon weapon) {
        this.type = type;
        this.country = country;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "country: "
                + getCountry()
                + "\ntype: "
                + getType();
    }
}
