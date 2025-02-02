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
    public static void main(String[] args){
        int[] arr={2,1,5,3,4};
        Node head=ConvertArr2LL.convert2LL(arr);
        Node sortedHead=sortedLL(head);
        ConvertArr2LL.printLL(sortedHead);
    }
}
