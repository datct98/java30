package lesson6_abstract.techmaster;

public class BizStudent extends TechmasterStudent{
    private double java;
    private double css;
    private double html;

    public BizStudent(String name, String major, double java, double css, double html) {
        super(name, major);
        this.java = java;
        this.css = css;
        this.html = html;
    }

    @Override
    public double getScore() {
        return (2*java+html+css)/4;
    }
}
