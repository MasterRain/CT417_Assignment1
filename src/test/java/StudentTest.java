import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    final private String startName = "steve";
    final private String changeName = "Eugene";
    final private int startAge = 19;
    final private int changeAge = 38;
    final private LocalDate startDoB = new LocalDate(1987, 10, 1);
    final private LocalDate changeDoB = new LocalDate(1900, 8, 16);
    final private int startID = 15333866;
    final private int changeID = 66833351;
    final private ArrayList<Course> startCourses= new ArrayList<Course>();
    final private ArrayList<Course> changeCourses= new ArrayList<Course>();
    final private ArrayList<Module> startModules= new ArrayList<Module>();
    final private ArrayList<Module> changeModules= new ArrayList<Module>();
    private Student test;

    @Before
    public void setUp() {

        test = new Student(startName, startAge, startDoB, startID, startCourses, startModules);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void getName() {

        assertEquals(startName,test.getName());

    }

    @Test
    public void setName() {
        test.setName(changeName);
        assertEquals(changeName, test.getName());
    }

    @Test
    public void getAge() {

        assertEquals(startAge, test.getAge());
    }

    @Test
    public void setAge() {

        test.setAge(changeAge);
        assertEquals(changeAge, test.getAge());

    }

    @Test
    public void getDoB() {

        assertEquals(startDoB, test.getDoB());

    }

    @Test
    public void setDoB() {

        test.setDoB(changeDoB);
        assertEquals(changeDoB, test.getDoB());

    }

    @Test
    public void getID() {

        assertEquals(startID, test.getID());

    }

    @Test
    public void setID() {

        test.setID(changeID);
        assertEquals(changeID, test.getID());

    }

    @Test
    public void getUsername() {
        assertEquals(""+startName+startAge, test.getUsername());

        test.setName(changeName);
        assertEquals(""+changeName+startAge, test.getUsername());

        test.setAge(changeAge);
        assertEquals(""+changeName+changeAge, test.getUsername());
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

    @Test
    public void getModules() {
        assertEquals(startModules, test.getModules());
    }

    @Test
    public void setModules() {

        test.setModules(changeModules);
        assertEquals(changeModules, test.getModules());

    }
}