# Prime Numbers with Prime Digit Sum

## Problem Statement

Write a program that accepts two integers **N** and **M**, and prints all prime numbers between **N** and **M** (inclusive) such that the **sum of their digits is also a prime number**.

---

## Input Format

- The first line contains two integers `N` and `M`.

---

## Output Format

Print all prime numbers between `N` and `M` (inclusive) whose **digit sum is also prime**.

---

## Constraints

- `1 ≤ N ≤ M ≤ 10^5`

---

## Example

### Input

```text
20 25
```

### Output

```text
23
```

### Explanation

- `23` is a prime number.
- Sum of digits = `2 + 3 = 5`
- `5` is also prime.

Hence, `23` is printed.

---

## Approach

1. Traverse every number from `N` to `M`.
2. Check whether the number is prime.
3. If it is prime, calculate the sum of its digits.
4. Check whether the digit sum is also prime.
5. Print the number if both conditions are satisfied.

---

## Complexity

- **Time:** `O((M - N + 1) × √M)`
- **Space:** `O(1)`

---

## Tags

`Number Theory` `Prime Numbers` `Digit Manipulation` `Math`