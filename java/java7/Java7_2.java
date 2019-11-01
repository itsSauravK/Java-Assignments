/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java7_2;

/**
 *
 * @author saurav
 */class Account{
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return getBalance();
    }

    public int debit(int amount){
        if(amount <= getBalance())
            this.balance = this.balance - amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= getBalance()){
            //Transfer amount to other account
            this.balance = this.balance - amount;
            another.credit(amount);
        }
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public String toString(){
        return "Account[id=" + getID() + ",name=" + getName() + ",balance=" + getBalance() + "]";
    }
}
public class Java7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account obj=new Account("A2","Saurav",200);
        Account obj1=new Account("A21","Saurav1",200);
        System.out.println("balance "+obj.transferTo(obj1,100));
        System.out.println(obj);
        System.out.println(obj1);
    }
    
}
