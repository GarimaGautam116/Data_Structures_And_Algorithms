package Stack;
public class Stack_With_Doubly_Linkedlist {
    static class Node {
        int data;
        Node next;
        Node previous;

        Node() {
            this.data = data;
        }
    }

    Node top;

    public void push(int data) {
        Node newnode = new Node();
        newnode.data = data;                //---------ASSIGNING VALUES TO THE NEW NODE
        newnode.next = top;                 //---------IT HELPS TO JOIN NEW NODE TO EXISTING NODE
        newnode.previous = null;
        top = newnode;                      //---------UPDATE TOP REFERENCE
    }

    public void pop() {
        if (top == null) {
            System.out.println("Empty");
        } else {
            top = top.next;
            top.previous = null;
        }
    }

    public void display() {
        //-------------CHECKING IF TOP IS NULL OR NOT
        if (top == null) {
            System.out.println("empty");
            return;
        } else {
            Node temp = top;
            while (temp != null)                         //------------SPECIFYING A CONDITION TO PRINT ALL VALUES
            {
                System.out.println(temp.data);
                temp = temp.next;                       //------------M0VING TOP TO NEXT OF THE TOP
            }

        }
    }

    public void peek() {
        if (top == null) {
            System.out.println("No value in Linked List");
        } else {
            System.out.println(top.data);
        }
    }
}
class stacksoublylinkedlist
{
    public static void main(String[] args) {

        Stack_With_Doubly_Linkedlist obj= new Stack_With_Doubly_Linkedlist();
        //-------------INSERT VALUES FROM THE TOP OF THE STACK
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

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

