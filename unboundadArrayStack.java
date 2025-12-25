class UnboundedArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2;                
        stack = new int[capacity];
        top = -1;
    }


    public void push(int x) {
      
        if (top == capacity - 1) {
            resize(capacity * 2);
        }

        stack[++top] = x;
        System.out.println(x + " pushed");
    }
  
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = stack[top--];

        
        if (top + 1 > 0 && top + 1 == capacity / 4) {
            resize(capacity / 2);
        }

        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
  
    public boolean isEmpty() {
        return top == -1;
    }
    private void resize(int newCapacity) {
        int[] newStack = new int[newCapacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;

        System.out.println("Resized stack to capacity: " + capacity);
    }
}

public class Main {
    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push(50);
        stack.push(60);

        System.out.println("Top element: " + stack.peek());
    }
}
