package leetcode150.linked_list;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode result = new ListNode();
        ListNode head = result;

        // time complexity O(m+n)
        // space complexity O(1)
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 == null) {
                result.val = list1.val;
                list1 = list1.next;
            } else if (list1 == null) {
                result.val = list2.val;
                list2 = list2.next;
            } else {
                if (list1.val <= list2.val) {
                    result.val = list1.val;
                    list1 = list1.next;
                } else {
                    result.val = list2.val;
                    list2 = list2.next;
                }
            }

            if (list1 != null || list2 != null) {
                result.next = new ListNode();
                result = result.next;
            }
        }

        return head;
    }
}
