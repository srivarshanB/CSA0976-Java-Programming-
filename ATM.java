import java.io.*;
import java.util.*;
class ATM
{
	public static void main(String args[])
	{
		int a,b,c,d,total;
		System.out.println("No of 2000 notes:");
		a=5;
		System.out.println("No of 500 notes:");
		b=4;
		System.out.println("No of 200 notes:");
		c=3;
		System.out.println("No of 100 notes:");
		d=5;
		total=2000*a+500*b+200*c+100*d;
		System.out.println("Total Amount:"+total);
	}
}