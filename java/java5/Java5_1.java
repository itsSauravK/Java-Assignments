import java.util.*;
import java.io.*;
import java.lang.*;
class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getID(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getName(){
        return getFirstName() + " " + getLastName();
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return getSalary() * 12;
    }

    public int raiseSalary(int percent){
        return (1 + (percent/100)) * salary; 
    }

    public String toString(){
        return "Employee[id=" + getID() + ",name=" + getName() + ",salary=" + getSalary() + "]";
    }
}

class Java5_1
{
    public static void main(String args[]){
	Employee obj=new Employee(124,"Saurav","Kumar",1000);
	System.out.println("Old: "+obj);
	obj.setSalary(3000);
	System.out.println("New: "+obj);
    }
}