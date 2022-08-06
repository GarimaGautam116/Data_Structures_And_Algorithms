package Recursion;
import java.util.Scanner;
public class PI {
    public static void printIncrease(int n){
        if(n>0){
            printIncrease(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
        printIncrease(a);
    }
}
