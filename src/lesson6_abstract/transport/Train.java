package lesson6_abstract.transport;

public class Train extends Vehicle{

    @Override
    public double calculateTime(double s) {
        return s/Constant.V_TRAIN;
    }
}
