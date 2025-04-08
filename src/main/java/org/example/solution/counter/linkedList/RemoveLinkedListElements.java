package linkedList;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);


        ListNode removedHead = remove(head, 2);

        while (removedHead != null){
            System.out.println(removedHead.val + " ");
            removedHead = removedHead.next;
        }
    }

    public static ListNode remove(ListNode head, int targetVal){

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == targetVal) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
