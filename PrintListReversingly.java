import java.util.Stack;

/**
 * Created by user on 2017/3/22.
 */
public class PrintListReversingly {
    public static class Node {
        public int value;
        public Node next;
        public Node(){
        }
        public Node(int data) {
            this.value = data;
        }
    }
    //采用递归的方法
    public static void PrintListRecursively(Node node) {
        if(node != null) {
            if(node.next != null) {
                PrintListRecursively(node.next);
            }
            System.out.print(node.value + " ");
        }
    }
    //采用栈的方法
    public static void PrintListReversingly(Node node) {
        Stack<Node> stack = new Stack<Node>();
        if(node == null) {
            System.out.println("List is empty!");
        }
        while(node != null) {
            stack.push(node);
            node = node.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().value + " ");
        }
    }
    public static void printLinkedList(Node head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        printLinkedList(head1);
        System.out.println("反向打印后");
        PrintListRecursively(head1);
        System.out.println();
        PrintListReversingly(head1);
    }
}
