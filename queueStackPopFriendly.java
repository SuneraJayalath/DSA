import java.util.LinkedList;
import java.util.Queue;

class QueueStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        q1.offer(x);

        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

        System.out.println(x + " pushed into stack");
    }


    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.poll();
    }

}


public class Main {
    public static void main(String[] args) {
        QueueStack stack = new QueueStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
     
    }
}
