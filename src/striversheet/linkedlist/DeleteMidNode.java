package striversheet.linkedlist;

public class DeleteMidNode {
    static Node deleteMid(Node head){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        System.out.println(len);
        temp=head;
        len=len/2;
        while(len>1){
            temp=temp.next;
            len--;
        }
        temp.next=temp.next.next;
        return head;
    }
    static Node deleteMidOptimal(Node head){
        Node slow=head;
        Node fast=head;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node newHead=deleteMid(head);
        System.out.println("Brute force: ");
        ConvertArr2LL.printLL(newHead);
        Node newHead1=deleteMidOptimal(head);
        System.out.println("Optimal: ");
        ConvertArr2LL.printLL(newHead1);
    }
}
