import java.util.*;
class splchar {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int len = s.length();
        char a[] = new char[len];
        int sp = 0;
        System.out.print("Special characters: ");
        for (int i = 0; i < len; i++) {
            a[i] = s.charAt(i);
            if (!((a[i] >= 'A' && a[i] <= 'Z') || (a[i] >= 'a' && a[i] <= 'z') || (a[i] >= '0' && a[i] <= '9') || a[i] == ' ')) {
                sp++;
                System.out.print(a[i]);
            }
        }
        System.out.println("\nNumber of special characters: " + sp);
    }
}
