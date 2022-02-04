import java.util.Scanner;

public class elementSearch
{
    public static int search(int[] arr, int n, int index)
    {
        if(index==arr.length)
            return -1;
        else if (n==arr[index])
            return index;
        else
            return search(arr,n,index+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int n= sc.nextInt();
        int loc=search(arr,n,0);
        if(loc==-1)
            System.out.println("Element not found.");
        else
            System.out.println("First occurence of "+ n+" found at index " +loc);
    }
}
© 2022 GitHub, Inc.
