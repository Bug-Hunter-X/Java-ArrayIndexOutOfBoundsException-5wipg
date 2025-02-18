# Java ArrayIndexOutOfBoundsException

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `Bug.java` file contains code that attempts to access an array element outside the valid index range. The `Solution.java` file provides a corrected version.

## Problem

The `Bug.java` code iterates through an array using a `for` loop, but the loop condition (`i <= arr.length`) is incorrect.  Valid array indices range from 0 to `arr.length - 1`. Trying to access `arr[arr.length]` results in an `IndexOutOfBoundsException`.

## Solution

The `Solution.java` file corrects the loop condition to `i < arr.length`, ensuring that the loop doesn't attempt to access an invalid array index.