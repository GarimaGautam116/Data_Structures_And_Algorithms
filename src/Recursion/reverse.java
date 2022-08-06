package Recursion;
import java.util.Scanner;
public class reverse {
    public static void  reversePrint(int n){
        if(n>0){
            System.out.println(n);
            reversePrint(n-1);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
       int a = sc.nextInt();
       reversePrint(a);
    }
}
