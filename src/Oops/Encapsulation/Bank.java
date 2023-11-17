package Oops.Encapsulation;

public class Bank {
    private int acNo=100;
    private String name="Ayush";
    private double bal=20000;
    private String add="Delhi";

    public int getAcNo() {
        return acNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public double getBal() {
        return bal;
    }
}
