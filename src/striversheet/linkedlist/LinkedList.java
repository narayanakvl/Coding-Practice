package striversheet.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        Node head=new Node(arr[2]);
        System.out.println(head.data+" "+head.next);
    }
}
class Node{
    int data;
    Node next;
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}