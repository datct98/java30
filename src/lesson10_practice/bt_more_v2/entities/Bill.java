package lesson10_practice.bt_more_v2.entities;

public class Bill {
    private static int autoId;
    private String id;
    private int oldNumber;
    private int newNumber;
    private String tern;
    private String customerId;

    public Bill(int oldNumber, int newNumber, String tern, String customerId) {
        this.id = "BI"+ ++autoId;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.tern = tern;
        this.customerId = customerId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Bill.autoId = autoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public String getTern() {
        return tern;
    }

    public void setTern(String tern) {
        this.tern = tern;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
