import java.util.Scanner;
public class BSort{
    public static void bubbleSort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int j = 0; j< arr.length - 1 - counter; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("size of array is");
            int n = sc.nextInt();
            int array[] = new int[n];
            System.out.println("enter the elements of array of n size");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            bubbleSort(array);
            display(array);

        }
    }
