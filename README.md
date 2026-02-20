
## LeetCode 75 problems workbook

## Top Interview 150 problems workbook

https://leetcode.com/u/mstoyanovca/


#### Functions to remember

```
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
```
