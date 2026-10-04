### Binary Tree

#### Array/String

- ```Arrays.stream(array)```
- ```Arrays.toString(array) vs Arrays.deepToString(array)```
- ```Arrays.sort(array) vs Arrays.parallelSort(array)```
- ```Arrays.binarySearch(array, key)```
- ```Arrays.equals(array1, array2) vs Arrays.deepEquals(array1, array2)```
- ```Arrays.fill(array, value)```
- ```Arrays.copyOf(array, length) vs Arrays.copyOfRange(int[] array, int from, int to)```
- ```Arrays.asList(T... a)```
- ```Set.of(array) vs new HashSet<>(Arrays.asList(array)) ```
- ```Arrays.stream(primitiveArray).boxed().collect(Collectors.toSet())```
- ```int[] primitiveArray = set.stream().mapToInt(Integer::intValue).toArray()```

#### DFS

- DFS stands for Depth First Search;
- it builds the tree subtree by subtree;
- it is usually done with recursion;
- it uses stack data structure;
- it works on the concept of LIFO;
- it is more suitable when there are solutions away from source;

#### BFS

- BFS stands for Breadth First Search;
- it builds the tree level by level;
- it uses Queue data structure;
- it works on the concept of FIFO;
- it is more suitable for searching vertices closer to the given source;
