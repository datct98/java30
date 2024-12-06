package lesson6_abstract.shape;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public int calculateArea() {
        return side*side;
    }

    @Override
    public int calculatePer() {
        return side*4;
    }


}
