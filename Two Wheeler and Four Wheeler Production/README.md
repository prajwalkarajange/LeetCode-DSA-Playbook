# Two Wheeler and Four Wheeler Production

## Problem Statement

Given:

- Total Vehicles = V
- Total Wheels = W

Find the number of Two-Wheelers (TW) and Four-Wheelers (FW).

If the input is invalid, print `INVALID INPUT`.

---

## Input

- Integer V
- Integer W

---

## Output

Print:

TW = <count>
FW = <count>

or

INVALID INPUT

---

## Example

### Input

200
540

### Output

TW = 130
FW = 70

---

## Approach

- Validate input.
- Calculate:
  - FW = (W − 2 × V) / 2
  - TW = V − FW
- If either becomes negative, print `INVALID INPUT`.

---

## Complexity

- **Time:** `O(1)`
- **Space:** `O(1)`

---

## Tags

`Math` `Simulation` `Equations`