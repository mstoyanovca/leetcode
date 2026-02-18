package top_interview_150.divide_conquer;

public class MergeKSortedLists {
    // divide: split the k lists into pairs
    // conquer: merge two sorted lists at a time
    // repeat
    // time complexity O(N*log(k)), where N is the number of nodes across all lists
    // space complexity: O(log(k)) due to the recursive function calls
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return divideAndConquer(0, lists.length - 1, lists);
    }

    private ListNode divideAndConquer(int left, int right, ListNode[] lists) {
        if (left == right) return lists[left];

        int middle = left + (right - left) / 2;
        ListNode leftNode = divideAndConquer(left, middle, lists);
        ListNode rightNode = divideAndConquer(middle + 1, right, lists);

        return mergeTwoLists(leftNode, rightNode);
    }

    private ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;

        if (node1.val < node2.val) {
            node1.next = mergeTwoLists(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeTwoLists(node1, node2.next);
            return node2;
        }
    }
}
