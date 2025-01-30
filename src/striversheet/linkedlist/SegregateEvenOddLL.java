package striversheet.linkedlist;

public class SegregateEvenOddLL {
    static Node SegregatetoOddEVen(Node head)
    {
        // creating Heads of Odd and Even LinkedLists
        Node oddHead = new Node(-1), oddTail = oddHead;
        Node evenHead = new Node(-1), evenTail = evenHead;
        Node curr = head, temp;
        while (curr!=null)
        {
            // Breaking the Link of the curr Node.
            temp = curr;
            curr = curr.next;
            temp.next = null;

            if (temp.data%2!=0) // If odd Node,append to odd LinkedList
            {
                oddTail.next = temp;
                oddTail = temp;
            }
            else // If Even Node,append to even LinkedList
            {
                evenTail.next = temp;
                evenTail = temp;
            }
        }
        evenTail.next = oddHead.next;
        // Appending Odd LinkedList at end of EvenLinkedList
        return evenHead.next;
    }

    public static void main(String args[])
    {
        int[] arr={1,2,3,4};
        Node head=ConvertArr2LL.convert2LL(arr);
        System.out.println("Intial LinkedList : ");
        ConvertArr2LL.printLL(head);
        Node newHead = SegregatetoOddEVen(head);
        System.out.println("LinkedList After Segregration ");
        ConvertArr2LL.printLL(newHead);
    }
}
