package Queue;

import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue:");
        QueueUsingArray queue = new QueueUsingArray(sc.nextInt());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enqueue(8);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.dequeue();
        queue.display();

    }
}
