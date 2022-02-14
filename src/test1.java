class Linked_List_1
{
    private static class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        //create new node
        Node nn = new Node();
        nn.data = data;
        nn.next = null;

        //attach
        if (this.size > 0) {
            this.tail.next = nn;
        }

        //update summary object
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }
}

public class test1
{
    public static void main(String[] args)
    {
        Linked_List_1 list = new Linked_List_1();
        int max  = Integer.parseInt(args[0]);
        for (int i=0; i< args.length; i++)
           if (max<Integer.parseInt(args[i]))
               max = Integer.parseInt(args[i]);
        System.out.println(max);
        int[] arr = new int[max];
        arr[0]=0;
        arr[1]=1;
        for (int i=0; i< arr.length-2; i++)
            arr[i+2]=arr[i]+arr[i+1];
        for (int i=0; i<args.length; i++)
            list.addLast(arr[Integer.parseInt(args[i])-1]);
        list.display();
    }
}