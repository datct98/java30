package lesson6_abstract.shape;

public abstract class Shape {
    public void printInfo(){
        System.out.println("Chu vi: "+calculatePer());
        System.out.println("Diện tích: "+calculateArea());
    }

    public abstract int calculateArea();
    public abstract int calculatePer();
}
