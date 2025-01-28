package striversheet.linkedlist;
# finding Length of loop in singly linked list
public class LengthOfLoop {
    static int findLength(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=fast.next;
                int count=1;
                while(slow!=fast){
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node Snode=new Node(2);
        head.next=Snode;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=Snode;
        System.out.println(findLength(head));
    }
}
