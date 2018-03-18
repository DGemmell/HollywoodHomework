import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;
import models.Studio;

public class Runner {

    public static void main(String[] args) {
        Studio studio = new Studio("Hollywood Studios", "California","debbies");
        Film film = new Film("Peter Rabbit",null,null);
        Director director = new Director("Will Gluck",100000,"comedy");
        Actor actor = new Actor("George Rabbit", 1000000.00, 90);
        DBHelper.saveOrUpdate(studio);
        DBHelper.saveOrUpdate(film);
        DBHelper.saveOrUpdate(director);

        Studio foundStudio = DBHelper.find(Studio.class, studio.getId());
        Film foundFilm = DBHelper.find(Film.class, film.getId());
        Director foundDirector = DBHelper.find(Director.class, director.getId());
        Actor foundActor = DBHelper.find(Actor.class, actor.getId());

    }
}
