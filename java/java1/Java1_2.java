import java.util.*;
import java.io.*;
import java.lang.*;

class Circle{
private double radius=1.0;
private String color="red";
public Circle(){
}

public Circle(double radius){
this.radius=radius;
}

public Circle(double radius,String color){
this.radius=radius;
this.color=color;

}
public double getRadius(){
return radius;
}

public void setRadius(double radius){

this.radius=radius;
}


public void setColor(String color){
this.color=color;

}
 public String getColor(){
        return color;
    }
public double getArea(){

return 3.142*getRadius()*getRadius();
}

public String toString(){
return "Circle[radius=" +getRadius()+" color="+getColor() +"]";
}
}

class Cylinder extends Circle{

private double height=1.0;
public Cylinder(){
}

public Cylinder(double radius){
super(radius);

}
public Cylinder(double radius,double height){
super(radius);
this.height=height;
}

public Cylinder(double radius,double height,String color){

super(radius,color);
this.height=height;
}
public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return 3.142 * getRadius() * getRadius() * getHeight();
    }
}

class Java1_2
{
public static void main(String args[]){

Circle circle1= new Circle();
 System.out.println("Circle1");
	circle1.setRadius(1.0);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getColor());
        circle1.setColor("yellow");
        System.out.println(circle1.getColor());
        System.out.println(circle1); 

Circle circle2 = new Circle(2.0);
        System.out.println("Circle2");
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2); 

 Circle circle3 = new Circle(3.0, "blue");
        System.out.println("Circle3");
        System.out.println(circle3.getRadius());
        System.out.println(circle3.getArea());
        System.out.println(circle3); 

 Cylinder obj = new Cylinder();
        obj.setColor("black");
        obj.setRadius(1.2);
	System.out.println("Height="+obj.getHeight());
        System.out.println(obj);  //calls toString method of Circle class
        //Note: you cannot call into methods of Cylinder class

        Cylinder obj2 = new Cylinder(2.0,4.0,"green");
        System.out.println(obj2); //calls toString method of Circle class because Cylinder doesnt have toString
        obj2.setColor("Orange");
	System.out.println("Height="+obj2.getHeight());
        obj2.setHeight(4.5);
        System.out.println(obj2); 


}
}
