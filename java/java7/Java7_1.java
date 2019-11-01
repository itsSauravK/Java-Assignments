/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java7_1;

/**
 *
 * @author saurav
 */
class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID(){
        return this.id;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return getUnitPrice() * getQty();
    }

    public String toString(){
        return "InvoiceItem[id=" + getID() + ",desc=" + getDesc() + ",qty=" + getQty() + ",unitPrice=" + getUnitPrice() + "]";
    }

}
public class Java7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       InvoiceItem obj=new InvoiceItem("A3","Heavy",4,10);
       System.out.println(obj);
    }
    
}
