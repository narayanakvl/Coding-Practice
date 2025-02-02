package striversheet.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class SortLL {
    static Node sortedLL(Node head){
        ArrayList<Integer> al=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            al.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(al);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.data=al.get(i);
            temp=temp.next;
            i++;
        }
        return head;
    }
    static Node sortLLOptimal(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node middle=getMiddle(head);
        Node right=middle.next;
        middle.next=null;
        Node left=head;
        left=sortLLOptimal(left);
        right=sortLLOptimal(right);
        return mergeTwoLL(left,right);
    }
    static Node getMiddle(Node head){
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node mergeTwoLL(Node left,Node right){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        int[] arr={2,1,5,3,4};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node sortedHead=sortLLOptimal(head);
        ConvertArr2LL.printLL(sortedHead);
    }
}
