/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java5_2;

/**
 *
 * @author saurav
 */

class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String toString(){
        return "[Name:"+this.name+",email:"+this.email+",gender:"+this.gender+"]";
    }
}
class Book{
    private String name;
    Author author;
    double price;
    int qty=0;
    public Book(String name,Author author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String name,Author author,double price,int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return this.name;
    }
     public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book :"+getName()+"Author "+this.author+",price:"+getPrice()+",qty:"+getQty();
    }
}


public class Java5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author a=new Author("Saurav","Av@",'m');
        Book b1=new Book("heave",a,400,10);
        System.out.println(b1);
    }
    
}
