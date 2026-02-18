
#### Functions to Remember

```
Character.isLetter(s.charAt(left));
Character.isDigit(s.charAt(left));
Character.isLetterOrDigit(s.charAt(left));

String filtered = s.chars().mapToObj(c -> (char) c).filter(Character::isLetterOrDigit).map(Character::toLowerCase).map(String::valueOf).collect(Collectors.joining());
```
