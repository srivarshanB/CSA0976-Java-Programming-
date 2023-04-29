import java.util.Scanner;
class RevAddPalindrome
{
	public static void main(String args[])
	{
        	Scanner sc=new Scanner(System.in);
        	int num=sc.nextInt();
        	int reverse=0;
        	int temp=num;
        	while(true)
		{
            		while(temp!=0)
			{
                		reverse=reverse*10+temp%10;
                		temp=temp/10;
            		}
            		if(num==reverse)
			{
                		System.out.println("Palindrome:"+num);
                		break;
            		}
			else
			{
                		System.out.println(num+"+"+reverse"+"=+(num+reverse));
                		num=num+reverse;
                		temp=num;
                		reverse=0;
            		}
        	}
    	}
}