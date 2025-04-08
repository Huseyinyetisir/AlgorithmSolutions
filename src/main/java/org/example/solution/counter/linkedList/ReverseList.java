package linkedList;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);


        ListNode reversedHead = reverse(head);

        while (reversedHead != null){
            System.out.println(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }


    }
    public static ListNode reverse(ListNode head){

        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

}
