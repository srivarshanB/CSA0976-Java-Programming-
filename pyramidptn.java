import java.io.*;
import java.util.*;
class pyramidptn
{
	public static void main(String args[])
 	{
 		int r,k=0,i,j;
		Scanner s=new Scanner(System.in);
 		System.out.println("enter the row:");
 		r=s.nextInt();
 		for(i=0;i<r;i++)
		{
 			for(j=r-i;j>1;j--)
  			{
   				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
   				System.out.print("* ");
			}
       			System.out.println();
    		}
  	}
}