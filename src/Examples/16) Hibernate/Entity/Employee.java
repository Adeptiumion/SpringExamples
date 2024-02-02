package Entity;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /*
    @GenerationType - описание стратегии по генерации значений для столбца с Primary key.
    * IDENTITY - полагается на автоматическое увеличение столбца по правилам, прописанным в БД.
    * AUTO - дефолт.
    * SEQUENCE - полагается на работу sequence созданного в БД.(В MySQL не работает, работает с Oracle)
    * UUID -
    * TABLE - полагается на значения столбца из другой таблицы.
     */
    @Column(name = "id")
    private int id;

    @Column(name = "salary")
    private int salary;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;


    public Employee() {

    }

    public Employee(
            int salary,
            String name,
            String surname,
            String department
    ) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public Employee(int id, int salary, String name, String surname, String department) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
