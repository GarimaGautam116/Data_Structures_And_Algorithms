import java.util.*;

public class charReplace
{
    public static String replace(char[] arr,char c1, char c2, int index)
    {
        if(index==arr.length)
        {
            return String.valueOf(arr);
        }
        if (c1==arr[index])
        {
            arr[index] = c2;
            return replace(arr, c1, c2, index + 1);
        }
        else
            return replace(arr,c1,c2,index+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        s=replace(arr,c1,c2,0);
        System.out.println(s);
    }
}