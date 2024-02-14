import java.io.*;
import java.util.*;
class fibonacci{
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=s.nextInt();
		int a1=0,a2=1;
		for(int i=0;i<n;i++){
 			System.out.print(a1+" ");
 			int a3=a1+a2;
 			a1=a2;
 			a2=a3;
		}
	}
}
