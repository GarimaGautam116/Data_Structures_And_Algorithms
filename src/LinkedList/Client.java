package LinkedList;

public class Client
{
    public static void main(String[] args) throws Exception
    {
        Singly_Linked_List list = new Singly_Linked_List();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(30);
        list.addFirst(50);
        System.out.println(list.size());
        list.addAt(60, 5);
        list.display();
        list.sort();
        list.display();
    }
}
