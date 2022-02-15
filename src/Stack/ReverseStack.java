// You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. 
// You are required to write a function that reverses the populated stack using the one which is empty.
// For Example:
// Alt txt

// Input Format :
// The first line of input contains an integer N, denoting the total number of elements in the stack.

// The second line of input contains N integers separated by a single space, representing the order in which the elements are pushed into the stack.
// Output Format:
// The only line of output prints the order in which the stack elements are popped, all of them separated by a single space. 
// Note:
// You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input stack itself.
// Constraints:
// 1 <= N <= 10^3
// -2^31 <= data <= 2^31 - 1

// Time Limit: 1sec 
// Sample Input 1:
// 6
// 1 2 3 4 5 10
// Note:
// Here, 10 is at the top of the stack.
// Sample Output 1:
// 1 2 3 4 5 10
// Note:
// Here, 1 is at the top of the stack.
// Sample Input 2:
// 5
// 2 8 15 1 10
// Sample Output 2:
// 2 8 15 1 10

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
