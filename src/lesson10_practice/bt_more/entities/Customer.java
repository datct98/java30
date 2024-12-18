package lesson10_practice.bt_more.entities;

public class Customer {
    private static int autoId;
    private String id;
    private String name;
    // Mã công tơ điện
    private String code;

    public Customer(String name, String code) {
        this.id = "KH"+ ++autoId;
        this.name = name;
        this.code = code;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Customer.autoId = autoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
