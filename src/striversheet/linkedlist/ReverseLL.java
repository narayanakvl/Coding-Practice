package striversheet.linkedlist;

import striversheet.recursion.Print1ToN;

import java.util.Stack;

public class ReverseLL {
    static Node reverseLL(Node head){
        Stack<Integer> stk=new Stack<>();
        Node temp=head;
        while(temp!=null){
            stk.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=stk.pop();
            temp=temp.next;
        }
        return head;
    }
    static Node reverseLLIterative(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node newHead=reverseLLIterative(head);
        ConvertArr2LL.printLL(newHead);
    }
}
