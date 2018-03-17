package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {
    private int id;
    private String title;
    private String director_name;
    private String actors;

    public Film() {
    }

//    i would like to add a list of actors but for now i have added as string
    public Film(String title, String director_name, String actors) {
        this.title = title;
        this.director_name = director_name;
        this.actors = actors;
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name ="directorname")
    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    @Column(name ="actors")
    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
