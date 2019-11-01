import java.util.*;
import java.io.*;
import java.lang.*;
//class Test{


//}


interface S{
public void show();

}


interface Q{
public void show();

}


class P{
public P(){
super();
System.out.println("Class P");
}
public void show(){
System.out.println("hello");
}
}


class R extends P implements Q{
public R(){
super();
System.out.println("Class R");
}
public void show(){
super.show();
}
}


class T extends R implements S{

public void show(){
super.show();
}
public T(){
System.out.println("Class T");
}
}


class D extends T implements C{
public static void main(String args[]){
D obj=new D();
obj.show();
}
public D(){

super();
System.out.println("Class D");

}
public void show(){
super.show();
}
}


interface C extends B{
public void show();
}
interface B extends A{
public void show();
}
interface A{
public void show();
}
