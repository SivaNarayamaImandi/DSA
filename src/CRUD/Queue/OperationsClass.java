package CRUD.Queue;

public class OperationsClass {
    public static void main(String[] args) {
        Queue queue =new Queue();
        queue.enQueue(92);
        queue.enQueue(322);
        queue.enQueue(23);
        queue.enQueue(252);
        queue.enQueue(22);
        queue.deQueue();
        queue.deQueue();
        queue.show();
    }
}
