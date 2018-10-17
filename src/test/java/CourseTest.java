import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CourseTest {

    final static private String startName = "Maths";
    final static private String changeName = "Poetry";
    final static private ArrayList<Student> startStudents = new ArrayList<Student>();
    final static private ArrayList<Student> changeStudents = new ArrayList<Student>();
    final static private ArrayList<Module> startModules = new ArrayList<Module>();
    final static private ArrayList<Module> changeModules = new ArrayList<Module>();
    final static private LocalDate startStart = new LocalDate(2017,8,2);
    final static private LocalDate changeStart = new LocalDate(2017,7,3);
    final static private LocalDate startEnd = new LocalDate(2018,3,9);
    final static private LocalDate changeEnd = new LocalDate(2018,2,10);
    private Course test;

    @Before
    public void setUp() {

        test = new Course(startName,startStudents, startModules,startStart, startEnd);

    }

    @After
    public void tearDown() {
    }


    @Test
    public void getName() {

        assertEquals(startName, test.getName());
    }

    @Test
    public void setName() {

        test.setName(changeName);
        assertEquals(changeName, test.getName());
    }

    @Test
    public void getStudents() {

        assertEquals(startStudents,test.getStudents());
    }

    @Test
    public void setStudents() {

        test.setStudents(changeStudents);
        assertEquals(changeStudents, test.getStudents());
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

    @Test
    public void getStart() {

        assertEquals(startStart, test.getStart());
    }

    @Test
    public void setStart() {

        test.setStart(changeStart);
        assertEquals(changeStart,test.getStart());
    }

    @Test
    public void getEnd() {

        assertEquals(startEnd, test.getEnd());
    }

    @Test
    public void setEnd() {

        test.setEnd(changeEnd);
        assertEquals(changeEnd, test.getEnd());
    }
}