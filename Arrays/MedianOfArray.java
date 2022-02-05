import java.io.*;
import java.util.*;

public class Solution {
    public static double medianofArrays(int [] nums1,int[] nums2){
        double median;
        int j=0;
        int[] num=new int[nums1.length + nums2.length];
        for(int i=0;i<num.length;i++){
            if(i<nums1.length){
                num[i]=nums1[i];
            }
            else if (j<nums2.length){
                num[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(num);
        if(num.length%2==0){
            int k =num.length/2 -1 ;
            int m =k+1;
            double sum = (num[k] + num[m]);
            median = sum/2;
        }
        else{
            int k = num.length/2;
            median =num[k];
        }
        return median ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        
        for(int i=0;i<n1;i++){
            arr1[i]= sc.nextInt();
            arr2[i]= sc.nextInt();
            }
        System.out.println(medianofArrays(arr1,arr2));
    }
}
