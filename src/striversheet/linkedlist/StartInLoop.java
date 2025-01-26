package striversheet.linkedlist;

import java.util.Stack;

public class StartInLoop {
    static Node findStart(Node head){
        Node temp=head;
        Stack<Node> st=new Stack<>();
        while(temp!=null){
            if(st.contains(temp)){
                return temp;
            }
            st.push(temp);
            temp=temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node Snode=new Node(2);
        head.next=Snode;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=Snode;
        System.out.println(findStart(head).data);
    }
}
