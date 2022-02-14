package Queue;

public class QueueUsingArray
{
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    QueueUsingArray(int size)
    {
        this.queue = new int[size];
        this.front=0;
        this.rear=0;
        this.size=size;
    }

    public boolean isFull()
    {
        return this.rear==this.size;
    }

    public boolean isEmpty()
    {

        return this.size==0;
    }

    public void enqueue(int data)
    {
        if (isFull())
            System.out.println("Queue is full.");
        else
        {
            this.queue[rear] = data;
            this.rear = (this.rear+1);
            this.size++;
        }
    }

    public void dequeue()   //follows FIFO so data is removed from 0th index
    {
        if (isEmpty())
            System.out.println("Queue is empty.");
        else
        {
            this.front = (this.front+1)%this.size;
            this.size--;
        }
    }

    public void display()
    {
        for (int i=0; i<this.size; i++)
        {
            System.out.println(this.queue[i]);
        }
    }

    public int getFront()
    {
        return this.queue[this.front];
    }

    public int getRear()
    {
        return this.queue[this.rear];
    }
}
