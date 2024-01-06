public class ListNodeMain {
    public static void main(String[] args) {
        ListNode head = null;
        LinkedList list = new LinkedList();
        head = list.insertAtEnd(head, 1);
        head = list.insertAtEnd(head, 2);
        head = list.insertAtEnd(head, 3);
        //list.printLL(head);
        head = list.insertAtBegin(head, 5);
        //list.printLL(head);
        head = list.insertAtIndex(head, 2, 6);
        //list.printLL(head);
        head = list.deleteAtIndex(head,2);
        list.printLL(head);
    }
}
