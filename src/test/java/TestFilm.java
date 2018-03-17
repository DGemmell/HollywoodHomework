import db.DBHelper;
import models.Actor;
import models.Film;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFilm {

    private Film film;
    private Actor actor;

    @Before
    public void before(){
        film = new Film("Peter Rabbit", "Will Gluck", null);
        actor = new Actor("James Corden", 35, 120000);
        DBHelper.saveOrUpdate(film);
        DBHelper.saveOrUpdate(actor);
    }

    @Test
    public void canSaveFilm(){
        Film found = DBHelper.find(Film.class, film.getId());
        assertEquals("Peter Rabbit",found.getTitle());

    }

    @Test
    public void canSaveActor(){
        Actor found = DBHelper.find(Actor.class, actor.getId());
        assertEquals("James Corden", found.getName());

    }








}
