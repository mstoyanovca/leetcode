
## Array/String

- Merge Sorted Array - E
- Remove Element - E
- Remove Duplicates from Sorted Array 1 - E
- Remove Duplicates from Sorted Array 2 - M
- Majority Element - E
- Rotate Array - M
- Best Time to Buy and Sell Stock 1 - E
- Best Time to Buy and Sell Stock 2 - M
- Jump Game 1 - M
- Jump Game 2 - M
- H-Index - M
- Insert Delete GetRandom O(1) (Randomized Set) (skip) - M
- Product of Array Except Self - M
- Gas Station - M
- Candy - H
- Trapping Rain Water - H
- Roman to Integer (skip) - E
- Integer to Roman (skip) - M
- Length of Last Word (skip) - E
- Longest Common Prefix - E
- Reverse Words in a String - M
- Zigzag Conversion - M
- Find the Index of the First Occurrence in a String (skip) - E
- Text Justification (skip) - H


## Functions to remember

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
