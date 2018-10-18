import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModuleTest {

    final static private String startName = "Computer Science";
    final static private String changeName = "Arts";
    final static private String startID = "CS&IT";
    final static private String changeID = "art";
    final static private ArrayList<Student> startStudents = new ArrayList<Student>();
    final static private ArrayList<Student> changeStudents = new ArrayList<Student>();
    final static private ArrayList<Course> startCourses = new ArrayList<Course>();
    final static private ArrayList<Course> changeCourses = new ArrayList<Course>();
    private Module test;

    @Before
    public void setUp() {

        test = new Module(startName,startID,startStudents,startCourses);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void getName() {

        assertEquals("steve", test.getName());
    }

    @Test
    public void setName() {

        test.setName(changeName);
        assertEquals(changeName, test.getName());
    }

    @Test
    public void getID() {

        assertEquals(startID,test.getID());
    }

    @Test
    public void setID() {

        test.setID(changeID);
        assertEquals(changeID, test.getID());
    }

    @Test
    public void getStudents() {

        assertEquals(startStudents, test.getStudents());
    }

    @Test
    public void setStudents() {

        test.setStudents(changeStudents);
        assertEquals(changeStudents, test.getStudents());
    }

    @Test
    public void getCourses() {

        assertEquals(startCourses, test.getCourses());
    }

    @Test
    public void setCourses() {

        test.setCourses(changeCourses);
        assertEquals(changeCourses, test.getCourses());
    }
}