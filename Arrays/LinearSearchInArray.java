import java.util.Scanner;
public class LSearch{
    public static int linearsearch(int[] arr,int item)
    {
        int i;
        for (i=0;i<arr.length;i++) {
            if (arr[i] == item) {
                return i;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array is");
        int n = sc.nextInt();
        int array[]= new int[n];
        System.out.println("enter the elements of array of n size");
        for (int i= 0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("elements of array are");
        for(int res:array)
            System.out.print(res + " ");

        System.out.println();
        System.out.println(linearsearch(array,56));
    }
}
