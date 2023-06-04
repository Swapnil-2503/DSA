# Recursion

Recursion is a programming technique where a function calls itself to solve a problem. It is a powerful concept widely used in computer science and is particularly useful in solving problems that can be broken down into smaller, repetitive subproblems.

## How Recursion Works

When a recursive function is called, it breaks down the problem into smaller subproblems. Each recursive call works on a smaller portion of the original problem until a base case is reached. The base case is a condition that determines when the recursion should stop and return a result.

Here's a general outline of how recursion works:

1. The function is called with an input.
2. The function checks if the input satisfies the base case. If yes, it returns a result.
3. If the base case is not satisfied, the function breaks down the problem into smaller subproblems.
4. The function calls itself recursively with the smaller subproblems as input.
5. The results of the recursive calls are combined to obtain the final result.

## Example

Consider the problem of calculating the factorial of a number. The factorial of a non-negative integer n, denoted as n!, is the product of all positive integers less than or equal to n.

Here's an example of a recursive function to calculate the factorial:

```python
def factorial(n):
    # Base case: factorial of 0 or 1 is 1
    if n == 0 or n == 1:
        return 1
    
    # Recursive case: multiply n with factorial of n-1
    return n * factorial(n - 1)
