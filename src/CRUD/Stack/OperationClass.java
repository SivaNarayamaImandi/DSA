package CRUD.Stack;

public class OperationClass {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(89);
//        System.out.println(stack.peek());

        DynamicStack dynamicStack = new DynamicStack();
        dynamicStack.push(39);
        dynamicStack.push(928);
        dynamicStack.push(9);
        dynamicStack.push(9877);
        dynamicStack.push(3);
        dynamicStack.push(9);
        dynamicStack.push(9877);
        dynamicStack.push(3);
//        dynamicStack.show();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.show();
    }
}
