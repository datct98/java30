package lesson8_arraylist.techmaster.entities;

public class Techmaster {
    private String manager;
    private String teacher;
    private Classroom classroom;

    public Techmaster(String manager, String teacher, Classroom classroom) {
        this.manager = manager;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Techmaster{" +
                "manager='" + manager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classroom=" + classroom +
                '}';
    }
}
