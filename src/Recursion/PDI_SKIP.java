package Recursion;
import java.util.Scanner;
public class PDI_SKIP {
    public static void skip(int n)
    {
        if(n>0)
        {
            if(n%2==1)
            {
                System.out.println(n);
            }
            skip(n-1);
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values");
        int a = sc.nextInt();
        skip(a);
    }
}
