package Queue;

import java.util.Scanner;
class Node04
{
    int data;
    Node04 next;
    public Node04(int data)
    {
        this.data = data;
        next = null;
    }
}
 class Queue_with_LinkedList {
    Node04 front;
    Node04 rear;

    public boolean isEmpty()
    {
        return (rear == null && front == null);
    }
    public void enqueue(int data)
    {
        Node04 newnode = new Node04(data);
        if (isEmpty())
        {
            front = rear = newnode;
        }
        else
        {
            rear.next = newnode;
            rear = newnode;                              //----rear = rear.next
        }
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(front.data);
            front = front.next;

            //---------------if there is only one element in the queue
            if(front==null)
            {
                rear = null;
            }
        }
    }
}

class QueueWithLinkedList_test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue:");
        int n = sc.nextInt();
        Queue_with_LinkedList obj = new Queue_with_LinkedList();
        System.out.println("Enter the values in the queue:");
        while(n!=0)
        {
            int data = sc.nextInt();
            obj.enqueue(data);
            n--;
        }
        System.out.println("Queue is Empty: "+obj.isEmpty());
        System.out.println("Values in the Queue:");
        while (obj.front!=null)
        {
            obj.dequeue();
        }
    }
}
