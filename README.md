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
