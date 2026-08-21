# Left Rotate Array by K Positions

## Problem Statement

Given an integer array `nums` and an integer `k`, rotate the array to the **left by `k` positions**.

A left rotation moves the first element of the array to the end. This process is repeated `k` times.

Return the resulting array after performing the rotation.

### Example 1

**Input:**

```text
nums = [10, 20, 30, 40, 50]
k = 2
```

**Output:**

```text
[30, 40, 50, 10, 20]
```

**Explanation:**

After rotating the array to the left by `2` positions:

```text
[10, 20, 30, 40, 50]
        ↓
[20, 30, 40, 50, 10]
        ↓
[30, 40, 50, 10, 20]
```

### Example 2

**Input:**

```text
nums = [1, 2, 3, 4, 5]
k = 1
```

**Output:**

```text
[2, 3, 4, 5, 1]
```

### Example 3

**Input:**

```text
nums = [1, 2, 3, 4, 5]
k = 4
```

**Output:**

```text
[5, 1, 2, 3, 4]
```

## Constraints

* `1 <= nums.length <= 10^5`
* `-10^9 <= nums[i] <= 10^9`
* `0 <= k < nums.length`

## Function Signature

```text
rotateLeft(nums, k)
```

### Parameters

* `nums` — An integer array.
* `k` — The number of positions to rotate the array to the left.

### Returns

* The array after rotating it to the left by `k` positions.
