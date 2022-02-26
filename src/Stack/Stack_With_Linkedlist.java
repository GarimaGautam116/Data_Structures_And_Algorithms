package Stack;

public class Stack_With_Linkedlist {

    public class Node
    {
        int data;
        Node next;
        //---------- Constructor
        Node()
        {
            this.data = data;
            next = null;
        }
    }

    Node top;
    Stack_With_Linkedlist()
    {
        top = null;
    }
    public void push(int data)
    {
        Node newnode = new Node();

        newnode.data = data;
        newnode.next = top;
        top = newnode;
    }
    public void display()
    {
        if (top==null)
        {
            System.out.println("empty");
            return;
        }
        else
        {
            Node temp = top;
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void pop()
    {

        if (top==null)
        {
            System.err.println("Empty List.");
            return;
        }
        else
        {
            top = top.next;               //---------ASSIGNING TOP TO NEXT OF TOP
        }
    }

    public  void peek()
    {
        if (top==null)
        {
            System.out.println("No value in Linked List");
        }
        else
        {
            System.out.println(top.data);
        }
    }
}
class stackwithlinkedtest
{
    public static void main(String[] args) {
        Stack_With_Linkedlist obj = new Stack_With_Linkedlist();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Top of Stack in Linked List:");
        obj.peek();

        System.out.println("Values in Stack:");
        obj.display();

        obj.pop();

        System.out.println("Top of Stack in Linked List After performing pop operation:");
        obj.peek();

        System.out.println("Stack values After Deleting some values.");
        obj.display();
    }
}
