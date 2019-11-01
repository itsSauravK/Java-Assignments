import java.lang.*;
import java.io.*;
import java.util.*;

class Customer {

    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name+"("+ID+")";
    }
}
class Java8_1{
    public static void main(String[] args) {

        Customer c = new Customer(101,"Saurav",20);
        System.out.println("Customer's name: "+c.getName());
        System.out.println("Customer's ID: "+c.getID());
        c.setDiscount(69);
        System.out.println("Customer's discount: "+c.getDiscount());
        System.out.println(c.toString());

    }

}