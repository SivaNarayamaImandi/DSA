package CRUD.Stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack if full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public void show() {
        int presntData = 0;
        for (int data : stack) {
            presntData++;
            if (top >= presntData) {
                System.out.println(data);
            }
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
        }
        return data;

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
