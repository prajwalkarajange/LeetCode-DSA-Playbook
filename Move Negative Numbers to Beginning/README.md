# Move Negative Numbers to Beginning

## Problem

Given an array containing both positive and negative numbers, rearrange the array so that all **negative numbers appear before all positive numbers**.

### Note

- The array does not contain zero.
- The order of negative or positive numbers does not matter.

## Example

### Input

```text
9
-12 11 -13 -5 6 -7 5 -3 -6
```

### Output

```text
-12 -13 -5 -7 -3 -6 11 6 5
```

## Explanation

Using the **Two Pointer** technique:

- Start one pointer from the beginning.
- Start another pointer from the end.
- If the left element is negative, move the left pointer.
- If the right element is positive, move the right pointer.
- Otherwise, swap the positive element on the left with the negative element on the right.

Continue until both pointers meet.

## Constraints

- `1 ≤ N ≤ 10^5`
- `-10^9 ≤ arr[i] ≤ 10^9`
- Array does not contain `0`

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = n - 1`
2. Move the left pointer while elements are negative.
3. Move the right pointer while elements are positive.
4. Swap when the left element is positive and the right element is negative.
5. Continue until `left >= right`.

## Complexity

- **Time:** `O(N)`
- **Space:** `O(1)`

## Tags

`Array` `Two Pointers` `Partition` `In-Place`