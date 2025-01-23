package striversheet.linkedlist;

public class SearchLL {
    public static int checkifPresent(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target)
                return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node head=ConvertArr2LL.convert2LL(arr);
        System.out.println(checkifPresent(head,5));
    }
}
