import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Module> modules;
    private LocalDate start;
    private LocalDate end;

    public Course(String name, ArrayList<Student> students, ArrayList<Module> modules, LocalDate start, LocalDate end) {
        this.name = name;
        this.students = students;
        this.modules = modules;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
