import java.util.*;
import java.io.*;
import java.lang.*;
public class AuthenticationException extends Exception{

public AuthenticationException(String message){
super(message);
}
}
class Authentication{

public static void main(String args[]) 
{
try{
Scanner sc=new Scanner(System.in);
System.out.println("Enter password");
String s=sc.next();
check(s);
}
catch(AuthenticationException ex){
System.out.println(ex.getMessage());
}
}
public static void check(String s1) throws AuthenticationException
{

if(!s1.equals("123"))
throw new AuthenticationException("Wrong password");
else
System.out.println("authentication success");
}

}