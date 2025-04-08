package linkedList;

public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {
        ListNode Ahead = new ListNode(3);
        ListNode Asecond = new ListNode(2);
        ListNode Athird = new ListNode(0);
        ListNode Afourth = new ListNode(-4);
        ListNode Afive = new ListNode(9);


        Ahead.next = Asecond;
        Asecond.next = Athird;
        Athird.next = Afourth;
        Afourth.next = Afive;

        ListNode Bhead = new ListNode(2);
        ListNode Bsecond = new ListNode(1);
        ListNode Bthird = new ListNode(0);

        Bhead.next = Bsecond;
        Bsecond.next = Bthird;
        Bthird.next = Afourth;



        System.out.println(getIntersectionNode(Ahead, Bhead));
    }

    private static Integer getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headA.next == null || headB == null || headB.next == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a.val;

    }


}
