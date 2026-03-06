#### Array, Character, String

```
int x = Character.getNumericValue(a.charAt(i));
int x = Integer.parseInt("110", 2);
Character.isLetter(s.charAt(left));
Character.isDigit(s.charAt(left));
Character.isLetterOrDigit(s.charAt(left));
Character.isWhitespace(char ch);
Character.isUpperCase(char ch);
Character.isLowerCase(char ch); 
Character.toUpperCase(char ch);
Character.toLowerCase(char ch);
Character.toString(char ch);

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

String.stripLeading()
String.stripTrailing()

Arrays.sort(points,  (a, b) -> a[0] - b[0]);
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

Collections.reverse(Arrays.asList(array))
Collections.max(map.values())

Set<String> operators = new HashSet<>(Set.of("+", "-", "*", "/"));
```

#### DSA algorithms

- interweave algorithm: in-place array rearranging, that runs in linear time with constant extra space
- Floyd's cycle detection algorithm: efficient for linked lists, because it uses constant extra space
- Kadane's algorithm: O(n) time and O(1) space DP technique to find the maximum sum of a contiguous subarray
- Kahn's algorithm: BFS method for topological sorting of a Directed Acyclic Graph (DAG) in O(V + E) time
    - all vertices with an in-degree of 0 are added to a queue, as they can appear first in the ordering
    - repeatedly remove a vertex from the queue, add it to the result list, and reduce the in-degree of all its adjacent vertices
    - if any of those vertices now have an in-degree of 0, they are added to the queue
    - continue until the queue is empty, the resulting order represents one valid topological sort of the graph
- binary exponentiation:
    - calculate x ^ n in O(log(n)) time, instead of O(n)
    - repeatedly square the base and halve the exponent
- memoization: memoized or optimized recursion

Sorting:

- Java’s built-in sorting methods, such as Arrays.sort(), adapt their algorithm depending on the type of data being processed:
    - for primitive arrays like int[] or double[], Java uses Dual-Pivot Quick Sort, which tends to be faster in practice but doesn’t guarantee stable sorting.
    - for arrays of objects that implement Comparable, it switches to a hybrid sorting algorithm called TimSort. TimSort draws its structure from Merge Sort.
- Merge Sort is consistent in its time complexity and is a stable sorting algorithm. It is suitable for both arrays and linked lists but requires additional
  space.
- Quick Sort is faster in practice and uses less auxiliary space compared to Merge Sort. It can perform poorly with certain datasets, leading to its worst-case
  time complexity of O(n²).

Binary tree traversal:

- Inorder (Left, Root, Right)
    - for BST, this yields nodes in ascending (sorted) order
- Preorder (Root, Left, Right)
- Postorder (Left, Right, Root)

- DFS = Depth First Search;
- DFS builds the tree by subtrees;
- DFS is usually done with recursion, but it can be done with dequeue/LIFO;
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

#### Collections

| Operation        | ArrayList | LinkedList |
|:-----------------|:----------|:-----------|
| Reading first    | O(1)      | O(1)       |
| Reading last     | O(1)      | O(1)       |
| Reading middle   | O(1)      | O(n)       |
| Adding last      | O(1)      | O(1)       |
| Inserting first  | O(n)      | O(1)       |
| Inserting middle | O(n)      | O(n)       |

Java Map implementations:

- HashMap - unordered
- LinkedHashMap - insertion order
- TreeMap - sorted order

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
    - the element with the lowest value is considered to have the highest priority and is accessed with peek() or removed with poll() in (O(log(n))) time
    - does not permit null elements
      `Queue<Integer> minHeap = new PriorityQueue<>();`
      `Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());`

Queue methods (FIFO):

| Method         | Behavior when the queue is full or empty |
|:---------------|:-----------------------------------------|
| add(element)   | throws an IllegalStateException          |
| offer(element) | returns false                            |
| remove()       | throws a NoSuchElementException          |
| poll()         | returns false                            |
| element()      | throws a NoSuchElementException          |
| peek()         | returns null                             |

Deque methods (LIFO):

| Method              | Behavior when the queue is full or empty |
|:--------------------|:-----------------------------------------|
| addFirst(element)   | throws an IllegalStateException          |
| offerFirst(element) | returns false                            |
| remove()            | throws a NoSuchElementException          |
| poll()              | returns null                             |
| element()           | throws a NoSuchElementException          |
| peek()              | returns null                             |

- add() = addLast()
- offer = offerLast()
- remove() = removeFirst()
- poll() = pollFirst()
- element() = getFirst()
- peek() = peekFirst()

Java Design Patterns:

- creational:
    - singleton
    - factory
- structural:
    - decorator (wrapper)
    - facade (hides internal implementation)
    - proxy
- behavioral:
    - iterator
    - observer (listener, one to many)
    - visitor - defines new operation
        - Element - accept(Visitor)
        - Visitor - visit(Element)
