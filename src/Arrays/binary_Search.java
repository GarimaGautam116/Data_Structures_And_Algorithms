package Arrays;
import java.util.Scanner;

public class binary_Search {
    public static int binary_Search(int[] arr,int item ){
        int n = arr.length-1;
        int low = 0;
       int  high =n-1;
      while(low <= high){
          int mid = (low + high)/2;
          if(arr[mid]<item){
              low = mid+1;
          }
          else if(arr[mid]>item){
              high=mid-1;
          }
          else{
              return mid;
          }
      }
      return -1;
    }
    public static void main(String[] args){
//        binary_Search obj = new binary_Search();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of aray");
        int n = sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter the values of array");
        for(int i=0;i<array.length-1;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the element to search in array");
        int m = sc.nextInt();
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i] + " ");
        }

        System.out.println("after searching index result is");
        System.out.println(binary_Search(array,m));
    }
}
