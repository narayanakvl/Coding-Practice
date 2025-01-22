package striversheet.linkedlist;

public class MiddleElementInLL {
    static Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node middleNode=findMiddle(head);
        System.out.println("middle element: "+middleNode.data);
    }
}
