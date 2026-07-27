# Count the Number of Sundays

## Problem

Given the starting day of a month and an integer `N`, count how many **Sundays** occur within the first `N` days from the start of the month.

## Example

### Input

```text
mon
13
```

### Output

```text
2
```

## Explanation

The month starts on **Monday**.

Using the weekly cycle:

- The first Sunday occurs after 6 days.
- The next Sunday occurs 7 days later.

Therefore, within the given range, there are **2 Sundays**.

## Constraints

- Starting day is one of:
  - `sun`, `mon`, `tue`, `wed`, `thu`, `fri`, `sat`
- `1 ≤ N ≤ 10^5`

## Approach

1. Map each weekday to an integer:
   - `sun = 0`, `mon = 1`, ..., `sat = 6`
2. Traverse from day `0` to day `N`.
3. For each day, compute:

   ```text
   (startDay + currentDay) % 7
   ```

4. If the result is `0`, it is a Sunday.
5. Count all such occurrences.

## Complexity

- **Time:** `O(N)`
- **Space:** `O(1)`

## Tags

`Simulation` `HashMap` `Modular Arithmetic` `Calendar`