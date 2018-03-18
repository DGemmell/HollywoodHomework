package models;

import behaviours.IDirect;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="director")
public class Director extends Employee implements IDirect {

    private String genre;
    private List<Film> films;

    public Director(){

    }

    public Director(String name, double salary, String genre, List<Film> films) {
        super(name, salary);
        this.genre = genre;
        this.films = films;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

//    how can i add two behaviours action and cut?
    public String direct() {
        return "Action!";
    }

    @OneToMany(mappedBy = "director")
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
