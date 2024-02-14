import java.io.*;
import java.util.*;
class vote{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int age=s.nextInt();
    if(age>18)
      System.out.println("eligible to vote");
    else if(age<=0)
      System.out.println("enter correct age");
    else
      System.out.println("you are eligible to vote after "+(18-age)+ " years");
  }
}