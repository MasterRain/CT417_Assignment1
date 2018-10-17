import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate DoB;
    private int ID;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, LocalDate DoB, int ID, ArrayList<Course> courses, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.DoB = DoB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate  getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {

        return "" + name + age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
