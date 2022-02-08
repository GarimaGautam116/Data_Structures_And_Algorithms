public class ADemo2 {
    int arr[];
    public ADemo2()
    {
        arr =new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void traverse() // method to traverse an array
    {
        for(int res:arr)
        {
            System.out.println(res);
        }
    }

    // method to insert values in the array
    public void insert(int index,int value) throws ArrayIndexOutOfBoundsException
    {
           if(arr[index]==Integer.MIN_VALUE)
           {
               arr[index]=value;
           }
           else
           {
               System.out.println("already filled");
           }
    }

    //method to search value in the array
    public void search(int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == value)
            {
                System.out.println("value found");
                return;// the control come out of method
            }
        }
        System.out.println("value not found");
    }

    //method to delete the values from array by index
    public void delete(int index) throws ArrayIndexOutOfBoundsException
    {
        arr[index]=Integer.MIN_VALUE; //overriding
        System.out.println("invalid index");
    }

    //method to delete the value from array by passing value
    public void deletevalue(int value)
    {
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==value)
           {
               arr[i]=Integer.MIN_VALUE;
           }
           else
           {
               System.out.println("value not found");
           }
       }
    }

    //method to delete  whole array
    public void deletearray()
    {
        arr=null;
    }
}


class ATest{
    public static void main(String[] args)
    {
        int arr[]={9,8,7,6,5,4};
        ADemo2 obj=new ADemo2();

        try
        {
         obj.insert(3,45);
         obj.delete(3);
            obj.search(7);
            obj.deletevalue(8);
            obj.traverse();
        }
        catch(ArrayIndexOutOfBoundsException obj1)
        {
            System.out.println("invalid index");
        }
    }
}
