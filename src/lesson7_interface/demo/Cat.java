package lesson7_interface.demo;

public class Cat implements IService{
    @Override
    public String calculate() {
        return null;
    }

    @Override
    public void speak(String word) {
        System.out.println(word);
    }
}
