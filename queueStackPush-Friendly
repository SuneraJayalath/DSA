import java.util.LinkedList;
import java.util.Queue;

class QueueStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.add(x);
    }

    int pop() {
        if (q1.isEmpty())
            return -1;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

}

public class Main {
    public static void main(String[] args) {
        QueueStack s = new QueueStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());  
       
    }
}
