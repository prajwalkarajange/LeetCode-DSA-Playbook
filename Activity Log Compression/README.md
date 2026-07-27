# Activity Log Compression

## Problem

Given a string `S` representing a sequence of user activities, compress consecutive identical activities using the following rule:

- Replace consecutive repeated characters with:
  - `Character + Frequency`
- Apply compression **only if the frequency is greater than 1**.

## Example 1

### Input

```text
LLLVVPP
```

### Output

```text
L3V2P2
```

## Example 2

### Input

```text
LVP
```

### Output

```text
LVP
```

## Explanation

Traverse the string from left to right and count consecutive occurrences of each character.

- If a character appears more than once consecutively, append its frequency.
- Otherwise, append only the character.

This technique is known as **Run Length Encoding (RLE)**.

## Constraints

- `1 ≤ |S| ≤ 10^5`
- String contains uppercase English letters.

## Approach

1. Initialize a counter for consecutive characters.
2. Traverse the string from index `1`.
3. If the current character matches the previous one, increment the counter.
4. Otherwise:
   - Append the previous character.
   - Append the count only if it is greater than `1`.
   - Reset the counter.
5. Process the final character/group after the loop.

## Complexity

- **Time:** `O(N)`
- **Space:** `O(N)`

## Tags

`String` `Run Length Encoding` `Two Pointers` `StringBuilder`