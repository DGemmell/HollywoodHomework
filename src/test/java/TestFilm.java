import db.DBHelper;
import models.Director;
import models.Employee;
import models.Film;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFilm {

    private Film film;
    private Director director;


    @Before
    public void before(){
        film = new Film("Peter Rabbit", null,null,null);
        DBHelper.saveOrUpdate(film);
    }

    @Test
    public void canSaveFilm(){
        Film found = DBHelper.find(Film.class, film.getId());
        assertEquals("Peter Rabbit",found.getTitle());

    }

    @Test
    public void canSaveActor(){
        Director found = DBHelper.find(Director.class, director.getId());
        assertEquals("comedy", found.getGenre());

    }








}
