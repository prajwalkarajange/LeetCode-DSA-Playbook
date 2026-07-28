# Largest Number in a String (Ignoring Numbers Containing 9)

## Problem Statement

Bastin once had trouble finding numbers embedded inside a string.

Each test case contains a string that may contain multiple numbers.

Your task is to extract all numbers that:

- are consecutive digits,
- do not contain the digit **9**.

If multiple valid numbers exist, print the **largest** one.

If no valid number exists, print **-1**.

> **Note:** Use `long long` (or `long` in Java) to store the numbers.

---

## Input Format

- The first line contains an integer `T`, representing the number of test cases.
- The next `T` lines each contain a string.

---

## Output Format

For each test case:

- Print the largest valid number.
- Print `-1` if no valid number exists.

---

## Constraints

- `1 ≤ T ≤ 100`
- `1 ≤ |S| ≤ 10000`

---

## Example

### Input

```text
1
This is alpha 5057 and 97
```

### Output

```text
5057
```

### Explanation

Numbers found:

- `5057` ✅ (does not contain digit `9`)
- `97` ❌ (contains digit `9`)

Hence, the answer is:

```text
5057
```

---

## Approach

1. Traverse the string character by character.
2. Whenever a digit is found, extract the complete number.
3. While extracting, check whether the number contains digit `9`.
4. If it does not contain `9`, compare it with the current maximum.
5. Print the maximum valid number.
6. If none exists, print `-1`.

---

## Complexity

- **Time:** `O(N)` per test case
- **Space:** `O(1)`

---

## Tags

`String` `Parsing` `Digit Manipulation` `Simulation`