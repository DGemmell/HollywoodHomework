package models;


import javax.persistence.*;

@Entity
@Table(name ="actor")
public class Actor{

    private int id;
    private String name;
    private int age;
    private double salary;

    public Actor() {
    }

    public Actor(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name ="age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name ="salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}