package Entity;

import Interfaces_of_annotations.UniDirectional;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bardel")
public class Bardel {
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bardel_id")
    @UniDirectional(autor = "Danil Gorev")
    private List<Whore> whoresList;

    public Bardel() {
    }

    public Bardel(String name, int maxSalary, int minSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addWhore(Whore whore){
        if (this.getWhoresList() == null)
            whoresList = new ArrayList<Whore>();
        whoresList.add(whore);

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

    public List<Whore> getWhoresList() {
        return whoresList;
    }

    public void setWhoresList(List<Whore> whoresList) {
        this.whoresList = whoresList;
    }

    @Override
    public String toString() {
        return "Траходом с id: " + getName()
                + "\n а бардельчик называют: " + getName()
                + "\n в бардельчике получают минимум: " + getMinSalary()
                + "\n в бардельчике получают максимум: " + getMaxSalary();
    }
}
