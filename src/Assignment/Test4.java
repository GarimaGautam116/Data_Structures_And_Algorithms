package Assignment;

class Linked_List_4
{
    private static class Node
    {
        String data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void display()
    {
        Node temp = this.head;
        while (temp != null)
        {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(String data)
    {
        //create new node
        Node nn = new Node();
        nn.data = data;
        nn.next = null;

        //attach
        if (this.size > 0)
        {
            this.tail.next = nn;
        }

        //update summary object
        if (this.size == 0)
        {
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else
        {
            this.tail = nn;
            this.size++;
        }
    }
}

public class Test4
{
    public static void main(String[] args)
    {
        Linked_List_4 list = new Linked_List_4();
        for (int i=0; i< args.length; i++)
        {
            String str1 = "", str2 = "";
            for (int j=0; j<args[i].length(); j++)
            {
                if ((args[i].charAt(j))%2==0)
                    str1+=String.valueOf(args[i].charAt(j));
                else
                    str2+=String.valueOf(args[i].charAt(j));
            }
            list.addLast(str1+str2);
        }
        list.display();
    }
}
