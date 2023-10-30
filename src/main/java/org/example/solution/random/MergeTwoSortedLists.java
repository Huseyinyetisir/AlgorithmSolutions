package org.example.solution.random;

public class MergeTwoSortedLists {

    public ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null ){
            if (l1.val < l2.val){
                l1.next = mergeTwoSortedList(l1.next,l2);
                return l1;
            }else {
                l2.next = mergeTwoSortedList(l1, l2.next);
                return l2;
            }
        }
        if(l1 == null)
            return l2;
        return l1;
    }


}
