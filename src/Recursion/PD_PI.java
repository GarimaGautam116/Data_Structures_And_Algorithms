package Recursion;
import java.util.Scanner;
public class PD_PI{
    public static void both(int n){
        if(n>0){
            System.out.println(n);
            both(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
         both(a);
    }
}
