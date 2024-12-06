package lesson5_oop.btvn;

public class Doctor extends Person{
    private int numberHour;
    private String major;

    public Doctor(String name, int age, int numberHour, String major) {
        super(name, age);
        this.numberHour = numberHour;
        this.major = major;
    }

    public int getNumberHour() {
        return numberHour;
    }

    public void setNumberHour(int numberHour) {
        this.numberHour = numberHour;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayInfo(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "numberHour=" + numberHour +
                ", major='" + major + '\'' +
                '}';
    }
}
