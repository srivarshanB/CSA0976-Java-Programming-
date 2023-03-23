import java.io.*;
import java.util.*;
class invertedpyptn
{
	public static void main(String args[])
 	{
 		int r,k=0,i,j;
		Scanner s=new Scanner(System.in);
 		System.out.println("enter the row");
 		r=s.nextInt();
 		for(i=1;i<=r;i++)
		{
 			for(j=1;j<i;j++)
  			{
   				System.out.print(" ");
			}
			for(j=i;j<=r;j++)
			{
   				System.out.print("* ");
			}
       			System.out.println();
    		}
  	}
}