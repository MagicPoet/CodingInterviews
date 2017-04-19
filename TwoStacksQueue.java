import java.util.Stack;

/**
 * Created by user on 2017/3/26.
 */
public class TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer> ();
    }

    public void add(int pushInt) {

        this.stackPush.push(pushInt);
    }

    public int poll() {
        if(stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty");
        }else if(stackPop.empty()) {
            while(!stackPop.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if(stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Query is empty");
        }else if(stackPop.empty()) {
            while(!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public static void main(String arg[]) {
        TwoStacksQueue test = new TwoStacksQueue();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
    }
}
