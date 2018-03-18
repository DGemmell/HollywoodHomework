package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {
    private int id;
    private String title;
    private List<Actor> actors;
    private Studio studio;
    private Director director;

    public Film() {
    }

    public Film(String title, List<Actor> actors, Studio studio, Director director){
        this.title = title;
        this.actors = new ArrayList<Actor>();
        this.studio = studio;
        this.director = director;
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

//    mapping for film and actor many to many

    @ManyToMany(mappedBy = "film", fetch = FetchType.EAGER)
    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @ManyToOne
    @JoinColumn(name ="director", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @ManyToOne
    @JoinColumn(name = "studio", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }


}
