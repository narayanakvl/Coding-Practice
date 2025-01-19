package striversheet.linkedlist;

public class Insertion {
    static Node insertHead(Node head,Node newHead){
        newHead.next=head;
        return newHead;
    }
    static Node insertTail(Node head,Node newTail){
        Node mover = head;
        while(mover.next!=null){
            mover=mover.next;
        }
        mover.next=newTail;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node newHead=new Node(100);
        Node presentHead=insertHead(head,newHead);
        ConvertArr2LL.printLL(presentHead);
        Node newTail=new Node(101);
        insertTail(presentHead,newTail);
        ConvertArr2LL.printLL(presentHead);
    }
}
