package Tree;

public class BinaryTreeUsingArray {
    int arr[];
    int lastusedindex;
    public BinaryTreeUsingArray(int size){
        arr=new int[size+1];
        lastusedindex=0;
    }
    public void insert(int value){
        if(lastusedindex>arr.length-1)
            return;
        arr[++lastusedindex]=value;
    }
    public void preorder(int index){
        if(index>lastusedindex)
            return;
        System.out.println(arr[index]);
        preorder(2*index);
        preorder(2*index+1);
    }
    public int search(int value){
        for(int i=1;i<lastusedindex;i++){
            if(arr[i]==value) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    public void delete(int value){
        int res=search(value);
        arr[res]=arr[lastusedindex];
        lastusedindex--;
    }

    public static void main(String[] args) {
        BinaryTreeUsingArray obj=new BinaryTreeUsingArray(5);
        obj.insert(45);
        obj.insert(33);
        obj.insert(22);
        obj.insert(15);
        obj.insert(16);
        obj.preorder(1);
        obj.search(25);
        obj.search(22);
        obj.delete(45);
        obj.preorder(1);
    }
}

