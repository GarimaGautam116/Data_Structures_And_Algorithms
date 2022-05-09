package Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int counter =1;counter<=arr.length-1;counter++){
            int val = arr[counter];
            int j = counter-1;
            while(j>=0 && arr[j] > val){
               arr[j+1] = arr[j];
               j--;
            }
            arr[j+1] = val;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arr[]=new int[sc.nextInt()];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        display(arr);
    }
}
