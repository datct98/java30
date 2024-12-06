package lesson5_oop.btvn;

import java.time.LocalDate;

public class Patient extends Person{
    private int number;
    private LocalDate dateJoin;

    @Override
    public String toString() {
        return "Patient{" +
                "number=" + number +
                ", dateJoin=" + dateJoin +
                '}';
    }

    public Patient(String name, int age, int number) {
        super(name, age);
        this.number = number;
        this.dateJoin = LocalDate.now();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(LocalDate dateJoin) {
        this.dateJoin = dateJoin;
    }

    public void displayInfo(){
        System.out.println();
    }
}
