import java.util.Stack;

class StackQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
        System.out.println(x + " enqueued");
    }

    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int dequeued = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }

    public int peek() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int front = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return front;
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
