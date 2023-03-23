import java.io.*;
import java.util.*;
class pascalptn 
{
	public int factorial(int i)
    	{
      	if (i == 0)
            	return 1;
        	return i*factorial(i - 1);
    	}
    	public static void main(String[] args)
    	{
        	int n ,i, j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of rows :");
		n=s.nextInt();
        	pascalptn g = new pascalptn();
        	for (i = 0; i <= n; i++) 
		{
            	for (j = 0; j <= n - i; j++) 
			{
                		System.out.print(" ");
            	}
            	for (j = 0; j <= i; j++) 
			{
                		System.out.print( " "+ g.factorial(i) /(g.factorial(i - j)* g.factorial(j)));
            	}
            	System.out.println();
        	}
    	}
}