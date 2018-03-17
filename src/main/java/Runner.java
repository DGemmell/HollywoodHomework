import db.DBHelper;
import models.Film;
import models.Studio;

public class Runner {

    public static void main(String[] args) {
        Studio studio = new Studio("Hollywood Studios", "California",null);
        Film film = new Film("Peter Rabbit","Will Gluck", "James Corden", null);
        DBHelper.saveOrUpdate(studio);
        DBHelper.saveOrUpdate(film);

        Studio foundStudio = DBHelper.find(Studio.class, studio.getId());
        Film foundFilm = DBHelper.find(Film.class, film.getId());

    }
}
