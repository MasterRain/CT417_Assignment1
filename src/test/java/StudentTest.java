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


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getDoB() {
    }

    @Test
    public void setDoB() {
    }

    @Test
    public void getID() {
    }

    @Test
    public void setID() {
    }

    @Test
    public void getUsername() {
    }

    @Test
    public void setUsername() {
    }

    @Test
    public void getCourses() {
    }

    @Test
    public void setCourses() {
    }

    @Test
    public void getModules() {
    }

    @Test
    public void setModules() {
    }
}