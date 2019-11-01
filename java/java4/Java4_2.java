import java.util.*;
import java.io.*;
import java.lang.*;

interface Movable{
public void moveUp();
public void moveDown();
public void moveLeft();
public void moveRight();
}

class MovablePoint implements Movable{
int x;
int y;
int xSpeed;
int ySpeed;
 public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "MovablePoint[x=" + this.x + ",y=" + this.y + ",xSpeed=" + this.xSpeed + ",ySpeed=" + this.ySpeed + "]";
    }

    public void moveUp(){

    }

    public void moveDown(){

    }

    public void moveLeft(){
    }

    public void moveRight(){

    }
}
class MovableCircle implements Movable{
private int radius;
private MovablePoint center;

public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius)
{
this.radius=radius;
this.center=new MovablePoint(x,y,xSpeed,ySpeed);
}
public String toString(){
return "MovableCircle[radius="+this.radius+","+center.toString()+"]";
}

 public void moveUp(){

    }

    public void moveDown(){

    }

    public void moveLeft(){
    }

    public void moveRight(){

    }
    
}

class Java4_2
{
    public static void main(String args[]){
	MovablePoint obj=new MovablePoint(0,0,5,5);
	System.out.println(obj);
	MovableCircle obj1=new MovableCircle(5,5,5,5,10);
	System.out.println(obj1);
    }
}
