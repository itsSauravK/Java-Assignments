import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangle{
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){

    }

    public Rectangle(float length, float width){

    }

    public float getLength(){
        return this.length;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    public double getPerimeter(){
        return 2 * (getLength() + getWidth());
    }

    public String toString(){
        return "Rectangle[length=" + getLength() + ",width=" +getWidth() +",area="+getArea()+",peri="+getPerimeter() +"]";
    }
}

class Java4_1
{
    public static void main(String args[]){
	Rectangle obj=new Rectangle();
	obj.setLength(2.0f);
	obj.setWidth(2.0f);
	System.out.println(obj);

	Rectangle rect1=new Rectangle(3.0f,4.0f);
	System.out.println(rect1);
    }
}