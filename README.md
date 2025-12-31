- LeetCode 75 problems workbook;
- LeetCode 150 problems workbook;
  https://leetcode.com/u/mstoyanovca/

Functions to remember:
List<String> list = Arrays.stream(s.trim().split(" ")).map(String::trim).filter(e → !e.isBlank()).toList().reversed();
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]))
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]))
stripTrailing()
stripLeading()
Collections.reverse(Arrays.asList(array))
Collections.max(map.values())

interweave algorithm
Floyd cycle detection algorithm

Binary tree traversal:
- Inorder (Left, Root, Right)
  -- for Binary Search Trees (BSTs), this yields nodes in ascending (sorted) order
- Preorder (Root, Left, Right)
  -- Creating a prefix (Polish) notation for expressions or copying/cloning the tree
- Postorder (Left, Right, Root)
  -- Deleting nodes in a binary tree or generating postfix (Reverse Polish) notation

DFS = Depth First Search;
DFS builds the tree subtree by subtree;
DFS uses dequeue/LIFO;
BFS = Breadth First Search;
BFS builds the tree level by level;
BFS uses queue/FIFO;
