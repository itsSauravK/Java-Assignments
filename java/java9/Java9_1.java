/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9_1;

/**
 *
 * @author saurav
 */
class Shape{
    private String color="red";
    private boolean filled=true;
    public Shape(){
        
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
     public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Shape[color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
class Circle extends Shape{
    private double radius=1.0;
     public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimeter(){
        return 2* Math.PI * getRadius();
    }

    public String toString(){
        return "Circle[radius=" + getRadius() +",Color: "+getColor()+"]";
    }
} 
 class Rectangle extends Shape{
     private double width=1.0;
     private double length=1.0;
     Rectangle(){
 }
     public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return getLength() * getWidth();
    }

    public double getPerimeter(){
        return 2 * (getLength() + getWidth());
    }

    public String toString(){
        return "Rectangle[length=" + getLength() + ",width=" +getWidth() + "]";
    }
}
class Square extends Rectangle{
    public Square(){
        
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
      public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }
    
    public String toString(){
        return "Square[side=" + getSide() + "]";
    }
}
public class Java9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c=new Circle(2,"red",true);
        System.out.println(c);
        Rectangle r=new Rectangle(2,3,"yellow",false);
        System.out.println(r);
        Square s=new Square(4);
        System.out.println(s);
        s.setSide(5);
        System.out.println(s);
    }
    
}
