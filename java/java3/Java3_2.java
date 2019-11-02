/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3_2;

/**
 *
 * @author saurav
 */
class Author{
    private String name;
    private String email;
    private char gender;
    public String toString(){
        return "Author"+this.name+",Email"+this.email+",gender"+this.gender;
    }
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
        
    }
    public String getName(){
        return this.name;
    }
}
class Book{
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;
    public Book(String name,Author[] authors,double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    public Book(String name,Author[] authors,double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return this.qty;
    }
    public String toString(){
        StringBuilder list=new StringBuilder();
        for(Author author:getAuthors()){
            list.append(author);
            list.append(",");
        }
        return "Book:"+getName()+"["+list.toString()+"]+price:"+getPrice();
    }
    public String getAuthorsName(){
    StringBuilder author_name=new StringBuilder();
    for(Author author: getAuthors()){
        author_name.append(author.getName());
        author_name.append(",");
    }
    return author_name.toString();
}
}
public class Java3_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Author[] author=new Author[2];
        author[0]=new Author("Saurav","sk@gmail.com",'m');
        author[1]=new Author("Saurav1","sk@gmail.com",'f');
        Book b=new Book("heaven",author,24);
        System.out.println("Authors:"+b.getAuthorsName());
        System.out.println(b);
    }
    
}
