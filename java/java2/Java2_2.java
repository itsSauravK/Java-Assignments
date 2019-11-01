import java.util.*;
import java.io.*;
import java.lang.*;
class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return "Person[name=" + getName() + ",address=" + getAddress() + "]";
    }
}
class Student extends Person{
private String program;
int year;
double fee;
public Student(String name,String address,String program,int year,double fee){
super(name,address);
this.program=program;
this.year=year;
this.fee=fee;
}

public String getProgram(){
return this.program;
}

public void setProgram(String program){
this.program=program;
}

public void setYear(int year){
this.year=year;
}

public int getYear(){
return this.year;
}

 public double getFee(){
        return this.fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

    public String toString(){
        return "Student[Person[name=" + getName() + ",address=" + getAddress() + "],program=" + getProgram() +
                ",year=" + getYear() + ",fee=" + getFee() + "]";
    }

}

class Staff extends Person{
private String school;
private double pay;
public Staff(String name,String address,String school,double pay){
super(name,address);
this.school=school;
this.pay=pay;

}

public String getSchool(){

return this.school;
}
public void setSchool(String school)
{
this.school=school;
}
public double getPay(){

return this.pay;
}
public void setPay(double pay){
this.pay=pay;

}
public String toString(){

return "[name ="+ getName()+" address= "+getAddress() +"school:"+getSchool()+"pay: "+getPay()+"]";


}
}

class Java2_2{

public static void main(String args[]){
Person obj=new Person("Saurav","xyz");
obj.setAddress("abc");
System.out.println("current address:"+obj.getAddress());
System.out.println(obj);

Student obj1=new Student("Saurav","xyx","cmpn",2019,100.0);
obj1.setProgram("extc");
obj1.setYear(2018);
System.out.println(obj1);

Staff obj3=new Staff("SAURAV","XYZ","tps",0.0);
obj3.setPay(1000.0);
obj3.setSchool("Thakur");
System.out.println(obj3);
}

}