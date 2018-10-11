import java.util.ArrayList;

public class Module {

    private String name;
    private String ID;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String ID, ArrayList<Student> students, ArrayList<Course> courses) {
        this.name = name;
        this.ID = ID;
        this.students = students;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
