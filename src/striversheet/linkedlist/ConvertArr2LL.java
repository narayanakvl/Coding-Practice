package striversheet.linkedlist;

public class ConvertArr2LL {
    static Node convert2LL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Node head=convert2LL(arr);
        System.out.println(head.data);
        printLL(head);
    }
}
