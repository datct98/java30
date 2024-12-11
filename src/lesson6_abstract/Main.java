package lesson6_abstract;

import lesson6_abstract.demo.Person;
import lesson6_abstract.demo.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        ((Student) person).calculateArea(10);
        Student student = new Student();

    }
}
