package Entity;

import Interfaces_of_annotations.BiDirectional;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "development_team")
public class DevelopmentTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;

    /*
    cascade = {
        CascadeType.DETACH,
                CascadeType.MERGE,
                CascadeType.PERSIST,
                CascadeType.REFRESH
    }
    */
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "developmentTeam",
            fetch = FetchType.LAZY // EAGER
    )
    @BiDirectional(autor = "Danil Gorev")
    private List<Developer> developerList;

    public DevelopmentTeam() {
    }

    public DevelopmentTeam(String name, int maxSalary, int minSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addDeveloper(Developer developer){
        if (this.getDeveloperList() == null)
            developerList = new ArrayList<Developer>();
        developerList.add(developer);
        developer.setDevelopmentTeam(this);
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

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }

    @Override
    public String toString() {
        return "id = " + id
                + "\nname = " + getName()
                + "\nmax salary = " + getMaxSalary()
                + "\nmin salary = " + getMinSalary();
    }
}
