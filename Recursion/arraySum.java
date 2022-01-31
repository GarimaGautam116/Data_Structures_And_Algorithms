import java.util.Scanner;

public class arraySum
{
    public static int sum(int[] arr, int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        return arr[n-1] + sum(arr,n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr, arr.length));
    }
}
