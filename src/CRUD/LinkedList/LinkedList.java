package CRUD.LinkedList;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node; //Node@5f184fc6
//            System.out.println(head);
        } else {
            Node n = head; //Node@5f184fc6
//            System.out.println(n);
            while (n.next != null) {
                n = n.next;
            }
//            System.out.println(node.next);
            n.next = node; //null
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
//            System.out.println(node.next);
            node = node.next;
        }
        System.out.println(node.data);
//        System.out.println(node.next);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next; //Node@5f184fc6
            }
            //        System.out.println(n.next);
            node.next = n.next; //Node@5f184fc6
            //        System.out.println(node.next);
            n.next = node; //Node@3feba861
            //        System.out.println(n.next);
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next; //Node@5f184fc6-->index data
//            System.out.println(n1);
            n.next = n1.next;
//            System.out.println(n.next);
            n1 = null;
        }
    }
}
