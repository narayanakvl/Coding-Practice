package striversheet.linkedlist;

import java.util.Stack;

public class PalindromeLL {
    static boolean isPalindrome(Node head){
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2,1};
        Node head=ConvertArr2LL.convert2LL(arr);
        System.out.println(isPalindrome(head));

    }
}
