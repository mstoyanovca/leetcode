package top_interview_150.binary_tree;

public class PopulateNextRightPointer2 {
    Node connect(Node root) {
        Node head = root;

        // time complexity O(n)
        // space complexity O(1)
        // outer loop, keeps track of the level
        while (head != null) {
            Node temp = new Node(101);
            Node firstNodeNextLevel = temp;

            // inner loop, keeps track of the node within a level
            while (head != null) {
                if (head.left != null) {
                    temp.next = head.left;
                    temp = head.left;
                }
                if (head.right != null) {
                    temp.next = head.right;
                    temp = head.right;
                }
                head = head.next;
            }
            head = firstNodeNextLevel.next;
        }

        return root;
    }
}
