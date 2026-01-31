- LeetCode 75 problems workbook;
- LeetCode 150 problems workbook;
- https://leetcode.com/u/mstoyanovca/

Functions to remember:

```
List<String> list = Arrays.stream(s.trim().split(" ")).map(String::trim).filter(e → !e.isBlank()).toList().reversed();
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]))
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]))
stripTrailing()
stripLeading()
Collections.reverse(Arrays.asList(array))
Collections.max(map.values())
```

- interweave algorithm
- Floyd cycle detection algorithm

Binary tree traversal:

- Inorder (Left, Root, Right)
    - for Binary Search Trees (BSTs), this yields nodes in ascending (sorted) order
- Preorder (Root, Left, Right)
    - Creating a prefix (Polish) notation for expressions or copying/cloning the tree
- Postorder (Left, Right, Root)
    - Deleting nodes in a binary tree or generating postfix (Reverse Polish) notation

- DFS = Depth First Search;
- DFS builds the tree by subtrees;
- DFS is usually done with recursion, but it can also be done with dequeue/LIFO;
- BFS = Breadth First Search;
- BFS builds the tree level by level;
- BFS uses queue/FIFO;

```
    // DFS with recusrion:
    public void preorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public void postorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
    
    // BFS with a queue:
    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode current = queue.remove();
            if (current.right != null) queue.add(current.right);
            if (current.left != null) queue.add(current.left);
        }
    }
```

Java Queue implementations:

- LinkedList: implements List, Queue and Deque interfaces
- ArrayDeque
    - implements Queue and Deque interfaces
    - backed by a resizable array and is generally more efficient than LinkedList for queue operations in a single-threaded environment
    - does not permit null elements
- PriorityQueue
    - min-heap by default, the smallest element is always at the head of the queue
    - a max-heap can be implemented by providing a custom Comparator
    - elements with higher priority are processed first, not necessarily in the order they were inserted
    - the element with the lowest value is considered to have the highest priority and is accessed with peek() or removed with poll() in (O(log n)) time
    - does not permit null elements
      `Queue<Integer> minHeap = new PriorityQueue<>();`
      `Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());`

Java Map implementations:

- HashMap - unordered
- LinkedHashMap - insertion order
- TreeMap - sorted order

Graph:

- G = (V, E), m = E, n = V
- vertex = node
- edge = connection between vertices
- adjacent = neighbour
- degree = number of edges between 2 nodes
- in-degree of a node = number of incoming edges
- DFS/recusrion/cycle check
- BFS/Kahn's algorithm: topological sorting of a DAG (Directed Acyclic Graph)
- both provide time complexity O(V + E) and space complexity O(V + E)
