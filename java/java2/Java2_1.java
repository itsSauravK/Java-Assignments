import java.util.*;
import java.io.*;
import java.lang.*;
class Author{
    private String name;
    private String email;
    private char gender;  //has to be m or f    

    public Author(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char getGender(){
        return this.gender;
    }

    public String toString(){
        return "Author[name=" + getName() + ",email=" + getEmail() + ",gender=" + getGender() + "]";
    }

}
class Java2_1{

public static void main(String args[]){
Author obj=new Author("Saurav","xyz@gmail.com",'m');
System.out.println("Current email:"+obj.getEmail());
obj.setEmail("abc@gmailcom");
System.out.println("New email:"+obj.getEmail());
System.out.println(obj);
}

}



