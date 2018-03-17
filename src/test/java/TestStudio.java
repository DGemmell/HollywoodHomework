import db.DBHelper;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestStudio {

    private Studio studio;

    @Before
    public void before(){
        studio = new Studio("Hollywood Studios", "California");
        DBHelper.saveOrUpdate(studio);

    }

    @Test
    public void canSaveStudioName(){
        Studio found = DBHelper.find(Studio.class, studio.getId());
        assertEquals("Hollywood Studios",found.getStudioname());

    }

    @Test
    public void canSaveStudioLocation(){
        Studio found = DBHelper.find(Studio.class, studio.getId());
        assertEquals("California",found.getLocation());

    }
}
