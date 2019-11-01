/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6_1;

/**
 *
 * @author saurav
 */
    class Circle{
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
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

    public double getCircumference(){
        return 2 * Math.PI * getRadius();
    }

    public String toString(){
        return "Circle[radius=" + getRadius() + "]";
    }
}
public class Java6_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Circle obj=new Circle(10);
        System.out.println("Area="+obj.getArea());
        System.out.println("Perim="+obj.getCircumference());
        System.out.println(obj);
        
    }
    
}
