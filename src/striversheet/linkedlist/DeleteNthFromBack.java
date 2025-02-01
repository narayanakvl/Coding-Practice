package striversheet.linkedlist;

public class DeleteNthFromBack {
    static Node deleteNode(Node head, int n){
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        Node slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node newHead=deleteNode(head,5);
        ConvertArr2LL.printLL(newHead);
    }
}
