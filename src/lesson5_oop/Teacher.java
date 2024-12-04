package lesson5_oop;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }

    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                "name: "+super.name+
                '}';
    }
}
