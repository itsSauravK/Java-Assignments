import java.util.*;
import java.io.*;
import java.lang.*;
class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
public String toString(){

StringBuilder date=new StringBuilder();

if(getDay()<10)
date.append(0);

date.append(getDay());
date.append("/");
if(getMonth()<10)
date.append(0);

date.append(getMonth());
date.append("/");

 date.append(getYear());

        return date.toString();
}
}

class Java3_1
{
public static void main(String args[]){

Date obj=new Date(1,2,2012);
System.out.println("Current : "+obj);
obj.setDay(21);
obj.setMonth(12);
obj.setYear(2019);
System.out.println("New : "+obj);
}
}

