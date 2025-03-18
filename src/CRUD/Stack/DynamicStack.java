package CRUD.Stack;

public class DynamicStack {
    int capacity = 2;
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (capacity == size()) {
            expand();
        }
        stack[top] = data;
        top++;
    }

    public void expand() {
        int length = size();
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }

    public void show() {
        int presntData = 0;
        for (int data : stack) {
//            presntData++;
//            if (top >= presntData) {
                System.out.println(data);
//            }
        }
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;

    }

    public void shrink() {
        int length = size();
        if(length<=(capacity/2)/2)
            capacity/=2;
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty 0 elements present in stack");
            return 0;
        } else
            return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}
