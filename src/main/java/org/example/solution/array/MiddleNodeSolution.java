package org.example.solution.array;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MiddleNodeSolution {

        public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }


    public static void main(String[] args) {
    // Example 1: Create a linked list [1 -> 2 -> 3 -> 4 -> 5]
    ListNode head1 = new ListNode(1);
    head1.next = new ListNode(2);
    head1.next.next = new ListNode(3);
    head1.next.next.next = new ListNode(4);
    head1.next.next.next.next = new ListNode(5);

    MiddleNodeSolution sol = new MiddleNodeSolution();
    ListNode middle1 = sol.middleNode(head1);
    printList(middle1);  // Output: [3, 4, 5]

    // Example 2: Create a linked list [1 -> 2 -> 3 -> 4 -> 5 -> 6]
    ListNode head2 = new ListNode(1);
    head2.next = new ListNode(2);
    head2.next.next = new ListNode(3);
    head2.next.next.next = new ListNode(4);
    head2.next.next.next.next = new ListNode(5);
    head2.next.next.next.next.next = new ListNode(6);

    ListNode middle2 = sol.middleNode(head2);
    printList(middle2);  // Output: [4, 5, 6]
}

// Helper function to print the linked list from the middle node
public static void printList(ListNode node) {
    while (node != null) {
        System.out.print(node.val + " ");
        node = node.next;
    }
    System.out.println();
}
}

