
## Top Interview 150

#### Review in groups

1. Array/String, Two Pointers, Sliding Window
2. Matrix, Intervals (optional)
3. HashMap (skip), Stack, Linked List, Binary Tree, Graph, Trie, Binary Search, Heap
4. Backtracking, Divide & Conquer, Kadane's Algorithm, Bit Manipulation, Math, 1D DP, Multi D DP (advanced)


#### Functions to remember

```
int x = Character.getNumericValue(a.charAt(i));
int x = Integer.parseInt("110", 2);
Character.isLetter(s.charAt(left));
Character.isDigit(s.charAt(left));
Character.isLetterOrDigit(s.charAt(left));

char[] chars = s.toCharArray();
Arrays.sort(chars);
String key = new String(chars);

String[] array = ["flower","flow","flight"];
Arrays.sort(array);
// it becomes flight, flow, flower
String csvString = String.join(",", array);

List<String> items = Arrays.asList("apple", "banana", "orange");
String csvString = String.join(",", items);
String csvString = items.stream().collect(Collectors.joining(","));

String s = "the sky is blue"
String result = String.join(" ", Arrays.stream(s.trim().split(" ")).map(String::trim).filter(Predicate.not(String::isBlank)).toList().reversed());
// it becomes: "blue is sky the"
String[] input = s.replace(" ", "").split("(?<=\\+)|(?=\\+)|(?<=-)|(?=-)|(?<=\\()|(?=\\()|(?<=\\))|(?=\\))");
String filtered = s.chars().mapToObj(c -> (char) c).filter(Character::isLetterOrDigit).map(Character::toLowerCase).map(String::valueOf).collect(Collectors.joining());

String.stripTrailing()
String.stripLeading()

Arrays.sort(points,  (a, b) -> a[0] - b[0]);
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

Collections.reverse(Arrays.asList(array))
Collections.max(map.values())

Set<String> operators = new HashSet<>(Set.of("+", "-", "*", "/"));
```

DSA algorithms:
- interweave algorithm
- Floyd's cycle detection algorithm
  - this is the most efficient method for linked lists, as it uses constant extra space
- Kadane's algorithm
- Kahn's algorithm
- binary exponentiation

Binary tree traversal:
- Inorder (Left, Root, Right)
    - for BST, this yields nodes in ascending (sorted) order
- Preorder (Root, Left, Right)
- Postorder (Left, Right, Root)

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

Dynamic Programming
- often called "memoized recursion" or "optimized recursion"
