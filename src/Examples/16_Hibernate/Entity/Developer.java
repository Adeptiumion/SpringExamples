package Entity;

import Interfaces_of_annotations.BiDirectional;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "developer")
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "salary")
    private int salary;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "development_team_id")
    @BiDirectional(autor = "Danil Gorev")
    private DevelopmentTeam developmentTeam;


    public Developer() {
    }

    public Developer(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public DevelopmentTeam getDevelopmentTeam() {
        return developmentTeam;
    }

    public void setDevelopmentTeam(DevelopmentTeam developmentTeam) {
        this.developmentTeam = developmentTeam;
    }

    @Override
    public String toString() {
        return "\nDeveloper with id: " + getId()
                + "\nname: " + getName()
                + "\nsurname: " + getSurname()
                + "\nsalary: " + getSalary() + "\n";
    }
}
