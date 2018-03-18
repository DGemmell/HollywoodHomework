import db.DBHelper;
import models.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDirector {

    private Director director;

    @Before
    public void before(){
        director = new Director(null, 0, "comedy");
        DBHelper.saveOrUpdate(director);
    }

    @Test
    public void canSaveDirector(){
        Director found = DBHelper.find(Director.class, director.getId());
        assertEquals("comedy", found.getGenre());

    }






//    @Test
//    public void canDirect(){
//        Director found = DBHelper.find(Director.class, director.getId());
//        assertEquals("Action!!", found.direct());
//
//    }

}
