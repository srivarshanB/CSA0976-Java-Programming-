import java.io.*;
import java.util.*;
class leftsidetriangleptn
{
	public static void main(String arg[])
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows :");
		int r=s.nextInt();
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=r-1;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}