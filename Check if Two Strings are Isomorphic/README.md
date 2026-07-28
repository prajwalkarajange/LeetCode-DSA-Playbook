# Check if Two Strings are Isomorphic

## Problem Statement

Given two strings `s1` and `s2`, consisting only of lowercase English letters and having equal length, determine whether the two strings are **isomorphic**.

Two strings are **isomorphic** if the characters in `s1` can be replaced to get `s2` while maintaining the order of characters.

### Rules

- Every character must map to exactly one character.
- A character may map to itself.
- No two different characters may map to the same character.

---

## Input Format

- First line contains string `s1`.
- Second line contains string `s2`.

---

## Output Format

Print:

```text
true
```

if the strings are isomorphic; otherwise print:

```text
false
```

---

## Constraints

- `1 ≤ s1.length ≤ 10^5`
- `s1.length == s2.length`
- Strings contain only lowercase English letters.

---

## Example 1

### Input

```text
aab
xxy
```

### Output

```text
true
```

### Explanation

```
a → x
b → y
```

Each character maps uniquely.

---

## Example 2

### Input

```text
aab
xyz
```

### Output

```text
false
```

### Explanation

The character `a` maps to two different characters, which is invalid.

---

## Example 3

### Input

```text
abc
xxz
```

### Output

```text
false
```

### Explanation

Two different characters map to the same character `x`, which is not allowed.

---

## Approach

1. If the string lengths differ, return `false`.
2. Use two HashMaps:
   - `s1 → s2`
   - `s2 → s1`
3. Traverse both strings together.
4. Validate existing mappings.
5. Add new mappings if valid.
6. If traversal completes, return `true`.

---

## Complexity

- **Time:** `O(N)`
- **Space:** `O(N)`

---

## Tags

`String` `HashMap` `Bi-directional Mapping` `Simulation`