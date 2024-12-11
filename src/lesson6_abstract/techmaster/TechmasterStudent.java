package lesson6_abstract.techmaster;

public abstract class TechmasterStudent {
    private String name;
    private String major;

    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "TechmasterStudent{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }


    public abstract double getScore();

    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Ngành: "+major);
        System.out.println("Học lực: "+classify());
        System.out.println("Điểm: "+getScore());
    }

    public String classify(){
        double score = getScore();
        if(score <5){
            return "Yếu";
        } else if(score<6.5){
            return "TB";
        } else if(score<8){
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
}
