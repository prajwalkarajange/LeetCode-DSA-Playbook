# Prefix Common Array of Two Arrays

## Problem Statement

Given two 0-indexed integer permutations `A` and `B` of length `n`, return the prefix common array `C`, where `C[i]` is the number of integers present in both prefixes `A[0...i]` and `B[0...i]`.

---

## Input Format

- First line: Integer `n`
- Second line: `n` integers representing array `A`
- Third line: `n` integers representing array `B`

---

## Output Format

Print the prefix common array.

---

## Constraints

- `1 ≤ n ≤ 50`
- `A.length == B.length`
- Both arrays are permutations of `1` to `n`.

---

## Example

### Input

```text
4
1 3 2 4
3 1 2 4
```

### Output

```text
[0,2,3,4]
```

### Explanation

For each index, count how many elements are common in the prefixes of both arrays.

---

## Approach

1. Maintain two HashSets for the prefixes of `A` and `B`.
2. At each index, insert the current elements into the respective sets.
3. Count the common elements by checking which values in Set A also exist in Set B.
4. Store the count in the result array.

---

## Complexity

- **Time:** `O(N²)`
- **Space:** `O(N)`

---

## Tags

`Array` `HashSet` `Prefix` `Simulation`