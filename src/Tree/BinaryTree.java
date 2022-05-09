package Tree;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
        }
    }
    // creation and attachment of nodes
    public void createBinaryTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of treenode");
        Node n1 = new Node(sc.nextInt());
        Node n2 = new Node(sc.nextInt());
        Node n3 = new Node(sc.nextInt());
        Node n4 = new Node(sc.nextInt());
        Node n5 = new Node(sc.nextInt());

        root = n1; //10
        n1.left = n2; //20------10
        n1.right = n3; //20-----10-------30
        n2.left = n4; //40---20----10----30
        n2.right = n5; //40---20---50---10----30
    }
    // using recursion
//    public void preOrderTraversal(Node root) {
//        if (root == null) {
//            return;
//        }
//        System.out.println(root.data + " ");
//        preOrderTraversal(root.left);
//        preOrderTraversal(root.right);
//    }

    //without recursion
    public void preOrderTraversal(Node root){
        if(root == null){
            return ;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrderTraversal(bt.root);
    }
}
