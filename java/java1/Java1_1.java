import java.util.*;
import java.io.*;
import java.lang.*;

class Circle{
private double radius=1.0;
private String color="red";

public Circle(){
}

public Circle(double r){
this.radius=r;
}

public double getRadius(){
return radius;
}

public double getArea(){
return 3.17*getRadius()*getRadius();
}
}

class Java1_1{

public static void main(String args[]){

Circle obj=new Circle();
System.out.println("Circle 1 ");
System.out.println(obj.getRadius());
System.out.println(obj.getArea());

Circle obj1=new Circle(2.0);
System.out.println("Circle 1 ");
System.out.println(obj1.getRadius());
System.out.println(obj1.getArea());

}
}