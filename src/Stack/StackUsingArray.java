package Stack;

public class StackUsingArray{
    // declaraton
    private int data[];
    private int tos;
    // initialization
    StackUsingArray(int n){
        data = new int[n];
        tos = -1;
    }

    // method to insert the values
    public void push(int item) throws Exception {
        if(isFull())
        {
            throw new Exception("overflow , push operation can't be performed ");
        }
        tos++;
        data[tos]=item;
    }

    // method to remove the value
    public int  pop() throws Exception {
        if(isEmpty()){
            throw new Exception("under flow , pop operation can't be performed ");
        }
        int temp = data[tos];
        data[tos]=0;
        tos--;
        return temp;
    }

    // method to get value at top
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("underflow , no element available");
        }
        int temp = data[tos];
        return temp ;
    }

    // method to check is stack empty
    public boolean isEmpty(){
        return size() == 0;
    }
    // method to check is stack full
    public boolean isFull(){
        return size()==data.length;
    }
    // method to get size of stack
    public int size(){
        return tos+1;
    }
    // method to print values of stack
    public void display(){
        System.out.println("---------------------");
        for(int i = tos ; i>=0;i--){
            System.out.print(data[i] + " ");
        }
        System.out.println(".");
        System.out.println("----------------------");
    }

    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        //System.out.println(" enter the size of array");
        int size = 5;   //sc.nextInt();
        StackUsingArray s = new StackUsingArray(size);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}

