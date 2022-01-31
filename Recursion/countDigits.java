import java.util.Scanner;

public class countDigits
{
    public static int count(int n)
    {
        if(n/10==0)
            return 1;
        else
            return 1+count(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextInt()));
    }
}
