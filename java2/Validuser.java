import java.io.*;
import java.util.*;
class Validuser{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        if(s1.equals(s2))
            System.out.println("Username is valid.");
        else 
            System.out.println("Username is invalid.");
    }
}