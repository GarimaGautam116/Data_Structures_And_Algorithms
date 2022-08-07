package LinkedList;

public class LLQuestion {
    Node head;
    int flag = 0;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void count() {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        System.out.println(c);
    }

    public void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void find(int x) {
        Node temp = head;
        while (temp!= null) {
            if (x == temp.data) {
                System.out.println("Found");
                flag = 1;
                break;
            }
            temp=temp.next;
        }
        if (flag == 1)
            delete(x);
    }

    public void add(int x) {
        Node newnode = new Node(x);
        Node temp = head;
        if(head==null) {
            head = newnode;
            newnode.next = null;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public void delete(int x) {
        Node temp = head;
        if (head.data == x)
            head = head.next;
        else {
            while (temp.next.next != null)
                if (temp.next.data == x)
                    temp.next = temp.next.next;
            temp = temp.next;
        }
        if (temp.data == x)
            temp.next = null;
    }

    public static void main(String[] args) {
        LLQuestion obj = new LLQuestion();
        obj.head=new Node(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.print();
        obj.count();
        obj.find(25);
        obj.find(20);
        obj.count();
        obj.print();
    }
}
