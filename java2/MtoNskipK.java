import java.io.*;
import java.util.*;
class MtoNskipK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        for (int i = m; i <= n; i = i + k + 1) {
            System.out.print(i + " ");
        }
    }
}