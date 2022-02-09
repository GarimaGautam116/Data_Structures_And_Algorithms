import java.util.Scanner;
public class BSearch {
    public static int binarysearch(int[] arr , int item)
    {
      int l =0;
      int h=arr.length-1;
      int mid;
      while(l<=h)
      {
          mid = (l+h)/2;
         if(item<arr[mid])
         {
             h=mid-1;
         }
         else if (item > arr[mid])
         {
             l = mid+1;
         }
         else
         {
             return mid;
         }

      }
      return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the elements of array of n size");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(binarysearch(array ,6));
    }

}
