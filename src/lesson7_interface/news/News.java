package lesson7_interface.news;

public class News implements INews{
    private String title;
    private String author;
    private double rate;

    public News(String title, String author, double rate) {
        this.title = title;
        this.author = author;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
