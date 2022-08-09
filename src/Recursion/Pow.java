package Recursion;
import java.util.Scanner;

public class Pow{
    public static int p(int x,int n){ // 2 , 4
        if(n==0){
            return 1;
        }
        int pnm1 = p(x,n-1);
        int fn = x*pnm1;
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base value");
        int x = sc.nextInt();
        System.out.println("enter the power term");
        int n = sc.nextInt();
        int val = p(x,n); //2 , 4
        System.out.println(val);
    }
}
