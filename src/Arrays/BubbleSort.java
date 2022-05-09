package Arrays;
import java.util.Scanner;
public class BubbleSort{
    public static void bubbleSort(int arr[]){
        for(int counter=0;counter<arr.length-1;counter++){
            for(int j =0;j<arr.length-1-counter;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }1
            }
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arr[]=new int[sc.nextInt()];
        int i=0;
        System.out.println("enter the elements of array");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       bubbleSort(arr);
        display(arr);
    }
}
