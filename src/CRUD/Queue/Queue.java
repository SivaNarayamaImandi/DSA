package CRUD.Queue;

public class Queue {
    int[] queue=new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data) {
        queue[rear]=data;
        rear++;
        size++;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[front+i]);
        }
        System.out.println();
        for(int i : queue){
            System.out.println(i);
        }
    }

    public int deQueue() {
        int data = queue[front];
        front++;
        size--;
        return data;
    }
}
