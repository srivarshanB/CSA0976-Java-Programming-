import java.io.*;
import java.util.Scanner;
class reverseword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String str = "";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            str = str + name.charAt(i);
        }
        System.out.println(str);
    }
}