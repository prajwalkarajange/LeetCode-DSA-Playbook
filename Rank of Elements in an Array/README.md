# Rank of Elements in an Array

## Problem

Given an array of `N` integers, replace every element with its **rank** in the array.

The rank of an element is its position when the array is sorted in ascending order.

- Equal elements should have the same rank.
- Rank starts from `1`.

## Input

```text
5
20 15 26 2 98
```

## Output

```text
3 2 4 1 5
```

## Explanation

Sorted unique elements:

```text
2 15 20 26 98
```

Ranks:

```text
2  → 1
15 → 2
20 → 3
26 → 4
98 → 5
```

Replacing the original array:

```text
20 → 3
15 → 2
26 → 4
2  → 1
98 → 5
```

Result:

```text
3 2 4 1 5
```

## Constraints

- `1 ≤ N ≤ 10^5`
- `-10^9 ≤ arr[i] ≤ 10^9`

## Approach

1. Copy the array.
2. Sort the copied array.
3. Assign ranks to unique elements.
4. Store ranks in a hash map.
5. Print the rank of each original element.

## Complexity

- **Time:** `O(N log N)`
- **Space:** `O(N)`

## Tags

`Array` `Sorting` `HashMap` `Coordinate Compression`
