import java.io.*;
import java.util.*;
class SI{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int pri=sc.nextInt();
		int year=sc.nextInt();
		char age=sc.next().charAt(0);
		double interest=0.0;
		if(age=='y'){
			interest=(pri*year*0.12)/100;
			System.out.println(interest);
		}
		else{
			interest=(pri*year*0.1)/100;
			System.out.println(interest);
		}
	}
}