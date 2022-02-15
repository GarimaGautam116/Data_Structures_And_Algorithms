package Stack;
import java.util.Scanner;
public class ReverseStack {
    int[] arr;
    int tos;
    public ReverseStack(int n){
        arr = new int[n];
        tos=-1;
    }
    public void push(int item){
        if(isFull()){
            System.out.println("overflow ");
        }
        tos++;
        arr[tos]=item;
    }
    public boolean isFull() {
        return tos==arr.length;
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Underflow");
        }
            return arr[tos--];
    }
    public boolean isEmpty(){
        if(tos==-1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of stack");
         int n= sc.nextInt();
        ReverseStack s1=new ReverseStack(n);
        ReverseStack s2=new ReverseStack(n);
        System.out.println("enter the values for stack1");
         for(int i=0;i<n;i++) {
             int num = sc.nextInt();
             s1.push(num);
         }

         while(!s1.isEmpty()){
             s2.push(s1.pop());
         }
        System.out.print("values pop from stack2 : ");
         while(!s2.isEmpty()){
             System.out.print(s2.pop()+" ");
         }
    }
}
