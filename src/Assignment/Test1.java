package Assignment;

class Linked_List_1
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

public class test1
{
    public static void main(String[] args)
    {
        Linked_List_1 list = new Linked_List_1();
        for (int i=0; i< args.length; i++)
        {
            String str = "";
            for (int j=0; j<args[i].toUpperCase().length(); j++)
            {
                if (((int)args[i].charAt(j))%2==0)
                    str+="e";
                else
                    str+="o";
            }
            list.addLast(str);
        }
        list.display();
    }
}
