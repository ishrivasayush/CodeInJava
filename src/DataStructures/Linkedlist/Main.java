package DataStructures.Linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(15);
        list.insert(23);
        list.insertAtStart(34);
        list.insertAt(0,55);
        list.show();
    }
}
