package leetcode150.linked_list;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode result = new ListNode();
        ListNode head = result;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 == null) {
                result.val = list1.val;
            } else if (list1 == null) {
                result.val = list2.val;
            } else {
                result.val = Math.min(list1.val, list2.val);

                result.next = new ListNode();
                result = result.next;
                result.val = Math.max(list1.val, list2.val);
            }

            if (list1 != null && list1.next != null || list2 != null && list2.next != null) {
                result.next = new ListNode();
                result = result.next;
            }

            list1 = list1 != null ? list1.next : null;
            list2 = list2 != null ? list2.next : list2;
        }

        return head;
    }
}
