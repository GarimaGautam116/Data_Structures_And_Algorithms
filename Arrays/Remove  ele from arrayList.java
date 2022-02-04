import java.util.Scanner;

    public class ArrayListt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the index whose element to be removes");
        int index=sc.nextInt();
        int i=0;
        for ( i = index; i <arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[i]= 0;
        for (i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

