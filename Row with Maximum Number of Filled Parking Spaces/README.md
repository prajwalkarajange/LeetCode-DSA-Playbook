# Row with Maximum Number of Filled Parking Spaces

## Problem Statement

A parking lot in a mall has **R × C** parking spaces.

Each parking space can either be:

- `0` → Empty
- `1` → Occupied

The parking lot is represented as a binary matrix.

Find the **1-based index of the row** having the maximum number of occupied parking spaces (`1`s).

---

## Input Format

- First line contains integer `R` (rows).
- Second line contains integer `C` (columns).
- Next `R` lines contain binary strings of length `C`.

---

## Output Format

Print the **1-based row index** containing the maximum number of `1`s.

---

## Constraints

- `1 ≤ R, C ≤ 1000`
- Matrix elements are only `0` or `1`.

---

## Example

### Input

```text
3
3
010
110
111
```

### Output

```text
3
```

### Explanation

| Row | Values | Count of 1's |
|-----|--------|-------------:|
|1|010|1|
|2|110|2|
|3|111|3|

Row **3** contains the maximum number of occupied parking spaces.

---

## Approach

1. Traverse each row.
2. Count the number of `1`s.
3. Track the row with the maximum count.
4. Print its **1-based index**.

---

## Complexity

- **Time:** `O(R × C)`
- **Space:** `O(1)`

---

## Tags

`Matrix` `Traversal` `Counting` `Array`