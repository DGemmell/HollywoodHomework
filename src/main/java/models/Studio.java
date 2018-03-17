package models;

import javax.persistence.*;

@Entity
@Table(name = "studio")
public class Studio {

    private int id;
    private String studioname;
    private String location;

    public Studio() {
    }

    public Studio(String studioname, String location) {
        this.studioname = studioname;
        this.location = location;
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
}
