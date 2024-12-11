package lesson6_abstract.transport;

public class Bus extends Vehicle{

    @Override
    public double calculateTime(double s) {
        return s/Constant.V_BUS;
    }
}
