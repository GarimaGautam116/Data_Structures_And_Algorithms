package Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int[] arr){
        for(int counter =0;counter<arr.length-1;counter++){
           int min = counter;
            for(int j=counter+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[counter];
            arr[counter]=temp;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr);
        display(arr);
    }
}
