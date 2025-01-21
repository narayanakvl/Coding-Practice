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
    static Node deleteKthPosition(Node head,int k){
        if(k==1){
            return deleteHead(head);
        }
        Node mover=head;
        int c=1;
        while(c<k-1){
            mover=mover.next;
            c++;
        }
        mover.next=mover.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node newHead=new Node(100);
        Node presentHead=deleteHead(head);
        ConvertArr2LL.printLL(presentHead);
        Node newTail=new Node(101);
        deleteTail(presentHead);
        ConvertArr2LL.printLL(presentHead);
        deleteKthPosition(presentHead,2);
        ConvertArr2LL.printLL(presentHead);
    }
}
