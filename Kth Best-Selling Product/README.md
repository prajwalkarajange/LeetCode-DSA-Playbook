# Kth Best-Selling Product

## Problem Statement

Amazon is preparing for its annual shopping festival and wants to identify its top-performing products.

Given the sales count of different products, find the **Kth best-selling product**.

The **Kth best-selling product** is the product whose sales rank is exactly **K** when all products are sorted in **descending order** of sales.

---

## Input Format

- The first line contains two integers `N` and `K`.
- The second line contains `N` integers representing the sales count of each product.

---

## Output Format

Print the sales count of the **Kth best-selling product**.

---

## Constraints

- `1 < K ≤ N ≤ 10^5`
- Sales count is a positive integer.

---

## Example 1

### Input

```text
6 3
50 20 70 40 90 60
```

### Output

```text
60
```

### Explanation

Descending order:

```text
90 70 60 50 40 20
```

The **3rd best-selling product** has **60** sales.

---

## Example 2

### Input

```text
5 2
15 25 10 40 30
```

### Output

```text
30
```

### Explanation

Descending order:

```text
40 30 25 15 10
```

The **2nd best-selling product** has **30** sales.

---

## Approach

1. Read `N` and `K`.
2. Store all sales counts in an array.
3. Sort the array in ascending order.
4. Print the element at index `N - K`.

---

## Complexity

- **Time:** `O(N log N)`
- **Space:** `O(log N)` (Java `Arrays.sort()` recursion stack)

---

## Tags

`Array` `Sorting` `Kth Largest Element` `Greedy`
