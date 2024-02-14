import java.io.*;
import java.util.*;
class removevow{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string:");
		String name=input.nextLine();
		String n1=name.replaceAll("[aeiouAEIOU]","");
		System.out.println(n1);
	}
}
