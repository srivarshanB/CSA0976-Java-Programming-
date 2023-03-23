import java.io.*;
import java.util.*;
class rectangleptn
{
	public static void main(String arg[])
	{
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		r=sc.nextInt();
		System.out.println("Enter no of columns:");
		c=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
		
		
		
	