package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studio")
public class Studio {

    private int id;
    private String studioname;
    private String location;
    private List<Film> films;

    public Studio() {
    }

    public Studio(String studioname, String location,List<Film> films) {
        this.studioname = studioname;
        this.location = location;
        this.films = films;
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

    @Column(name = "studioname")
    public String getStudioname() {
        return studioname;
    }

    public void setStudioname(String studioname) {
        this.studioname = studioname;
    }

    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @OneToMany (mappedBy = "studio")
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
