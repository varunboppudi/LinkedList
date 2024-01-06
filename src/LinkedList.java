import java.sql.SQLOutput;

public class LinkedList {
    public ListNode insertAtBegin(ListNode h, int v){
        ListNode nn = new ListNode(v);
        if(h == null) {
            h = nn;
        }else{
            nn.next = h;
            h = nn;
        }
        return h;
    }
    public ListNode insertAtEnd(ListNode h, int val){
        ListNode nn = new ListNode(val);
        if(h == null){
            return nn;
        }
        ListNode p = h;
        while(p.next != null){
            p = p.next;
        }
        p.next = nn;
        return h;
    }
    public ListNode insertAtIndex(ListNode h, int index, int val){
        ListNode nn = new ListNode(val);
        if(h == null)
            return nn;
        ListNode p = h;
        for(int i = 1; i < index; i++){
            p = p.next;
        }
        nn.next = p.next;
        p.next = nn;
        return h;
    }
    public ListNode deleteAtIndex(ListNode h, int index){
        if(h == null){
            System.out.println("List is already empty");
            return null;
        }
        ListNode p = h;
        for(int i = 1; i< index; i++)
            p = p.next;
        p.next = p.next.next;
        return h;    }
    public void printLL(ListNode h){
        ListNode p = h;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
    public ListNode deleteAtbegin(ListNode h) {
        if (h == null) {
            System.out.println("List is empty");
            return null;
        }
        ListNode p = h;
        h = h.next;
        return h;
    }
    public ListNode deleteAtend(ListNode h)
    {
        if(h==null)
        {
            System.out.println("List is empty");
            return null;
        }
        ListNode p = h;
        p.next.next=null;
        return h;
    }

    }

