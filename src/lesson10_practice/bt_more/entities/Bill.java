package lesson10_practice.bt_more.entities;

public class Bill {
    private static int autoId;
    private String id;
    private int oldNumber;
    private int newNumber;
    private String tern;
    private Customer customer;

    public Bill(int oldNumber, int newNumber, String tern, Customer customer) {
        this.id = "BI"+ ++autoId;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.tern = tern;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                ", oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", tern='" + tern + '\'' +
                ", customer=" + customer +
                '}';
    }
}
