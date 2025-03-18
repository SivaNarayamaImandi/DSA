package CRUD.LinkedList;

/*
Comments for understanding the process
if you don't want to remove the comment
 */
public class CRUDMainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(378);
        list.insertAtStart(641);
        list.insertAt(2, 10);
        list.deleteAt(2);
        list.show();
    }
}