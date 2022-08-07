package Recursion;
import java.util.Scanner;
public class Factorial{
    public static int fact(int n)
    {
        if (n > 0)
        {
            int fnm1 = fact(n - 1);
            int fn = n * fnm1;
            return fn;

        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value whose factorial to find");
        int a = sc.nextInt();
        int res = fact(a);
        System.out.println("fact of a is : "+ res);
    }
}