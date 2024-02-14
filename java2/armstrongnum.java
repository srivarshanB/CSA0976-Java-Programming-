import java.io.*;
import java.util.*;
class armstrongnum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		int num1=n;
		int arm=0;
		while(num1!=0){
			int rem=num1%10;
 			arm=arm+(rem*rem*rem);
 			num1=num1/10;
		}
		if(n==arm)
 			System.out.print("Armstrong number");
		else
 			System.out.print("Not Armstrong");
	}
}