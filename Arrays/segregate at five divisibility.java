public class segregateArray {
    public static void main(String[] args) {
        int arr[] = {45, 3, 12, 67, 40, 25, 23, 15};
        int ans[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 != 0) {
                ans[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                ans[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
