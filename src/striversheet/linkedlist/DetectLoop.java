package striversheet.linkedlist;

import java.util.HashSet;

public class DetectLoop {
    static boolean detectLoop(Node head){
        HashSet<Node> hs = new HashSet<>();
        Node temp=head;
        while(temp!=null){
            if(hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp=temp.next;
        }
        return false;
    }
    static boolean detectLoopOptimal(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node Snode=new Node(2);
        head.next=Snode;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=Snode;
        System.out.println("Brute force: "+detectLoop(head));
        System.out.println("Optimal: "+detectLoopOptimal(head));
    }
}
