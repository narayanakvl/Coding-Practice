package striversheet.linkedlist;

public class Deletion {
    static Node deleteHead(Node head){
        Node newHead=head.next;
        head.next=null;
        return newHead;
    }
    static Node deleteTail(Node head){
        Node mover = head;
        while(mover.next.next!=null){
            mover=mover.next;
        }
        mover.next=null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node newHead=new Node(100);
        Node presentHead=deleteHead(head);
        ConvertArr2LL.printLL(presentHead);
        Node newTail=new Node(101);
        deleteTail(presentHead);
        ConvertArr2LL.printLL(presentHead);
    }
}
