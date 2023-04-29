import java.io.*;
import java.util.*;
class countprimecomp
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int a=s.nextInt();
		int d[]=new int[a];
		int i,c=0,p=0,j,b;
		for(i=0;i<a;i++)
		{
			System.out.println("enter element"+i+":");
			d[i]=s.nextInt();
		}
		for(i=0;i<a;i++)
		{
			b=d[i];
			for(j=2;j<b;j++)
			{
				if(b%j==0)
					c++;
				else
					p++;
					break;
			}
		}
		System.out.println("composite number:"+c);
		System.out.println("prime number:"+p);
	}
}