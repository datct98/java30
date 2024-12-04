package lesson5_oop;

public class Employee extends Person{
    private String placeWork;
    private double exp;

    public Employee(String name, int age, String address, String placeWork, double exp) {
        super(name, age, address);
        this.placeWork = placeWork;
        this.exp = exp;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return name+" - "+super.getAge()+" - "+super.getAddress()+" - "+placeWork+" - "+exp;
    }
}
