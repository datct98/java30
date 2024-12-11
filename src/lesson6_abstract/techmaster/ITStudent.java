package lesson6_abstract.techmaster;

public class ITStudent extends TechmasterStudent{
    private double marketing;
    private double sale;

    public ITStudent(String name, String major, double marketing) {
        super(name, major);
        this.marketing = marketing;
    }

    @Override
    public double getScore() {
        return (marketing *2+sale)/3;
    }
}
