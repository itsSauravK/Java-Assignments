/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8_2;

/*
 *
 * @author saurav
 */
class MyPoint{
    private int x;
    private int y;
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return this.x+" ,"+this.y;
    }   
    
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;}
    
    public double distance(MyPoint point2){
        return Math.sqrt(
                (point2.getX() - this.getX()) * (point2.getX() - this.getX()) +
                (point2.getY() - this.getY()) * (point2.getY() - this.getY())
            );
    }
            
}
class MyTriangle{
    private MyPoint v1;
     private MyPoint v2;
      private MyPoint v3;
      
      public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
          v1=new MyPoint(x1,y1);
          v2=new MyPoint(x2,y2);
          v3=new MyPoint(x3,y3);
      }
      public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
          this.v1=v1;
          this.v2=v2;
          this.v3=v3;
          
      }
      public String toString(){
          return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
      }
      public double getPerimeter(){
         return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
}
      public String getType(){
          double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
 System.out.println(a+"  "+b+"  "+c);
        if(a==b && b==c && a==c)
            return "Equilateral";

        else if( a==b || a==c||(b==c) )
            return "Isoceles";
        
        else 
            return "Scalene";

      }
      }
      

public class Java8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyTriangle m1=new MyTriangle(0,0,0,3,3,0);
        System.out.println(m1);
        System.out.println("Type "+m1.getType());
        MyPoint p1=new MyPoint(0,0);
         MyPoint p2=new MyPoint(2,2);
          MyPoint p3=new MyPoint(4,4);
          MyTriangle m2=new MyTriangle(p1,p2,p3);
         System.out.println(m2);
        System.out.println("Type "+m2.getType());  
    }
    
}
