package models;

import db.DBHelper;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="actors")
public class Actor extends Employee {

    private int age;
    private List<Film> films;

    public Actor(String name, double salary, int age) {
        super(name, salary);
        this.age = age;
    }

    @Column(name ="age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @ManyToMany
    @JoinTable(name = "actors_films",
            joinColumns = {@JoinColumn(name = "actor_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)}
    )
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
