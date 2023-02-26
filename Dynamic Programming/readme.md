

# dynamic programming dp 

**** Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial. ****

*** Essentially, it is a simple idea, after solving a problem with a given input, save the result as a reference for future use, so you won’t have to re-solve it.. briefly ‘Remember your Past’ :). 

It is a big hint for DP if the given problem can be broken up into smaller sub-problems, and these smaller subproblems can be divided into still smaller ones, and in this process, you see some overlapping subproblems. 
Additionally, the optimal solutions to the subproblems contribute to the optimal solution of the given problem (referred to as the Optimal Substructure Property).
 The solutions to the subproblems are stored in a table or array (memoization) or in a bottom-up manner (tabulation) to avoid redundant computation.
The solution to the problem can be constructed from the solutions to the subproblems.
Dynamic programming can be implemented using a recursive algorithm, where the solutions to subproblems are found recursively, or using an iterative algorithm, where the solutions are found by working through the subproblems in a specific order.

# Dynamic programming works on following principles: 

Characterize structure of optimal solution, i.e. build a mathematical model of the solution.
Recursively define the value of the optimal solution. 
Using bottom-up approach, compute the value of the optimal solution for each possible subproblems.
 Construct optimal solution for the original problem using information computed in the previous step.

#  What is the difference between a Dynamic programming algorithm and recursion?


In dynamic programming, problems are solved by breaking them down into smaller ones to solve the larger ones, while recursion is when a function is called and executed by itself. While dynamic programming can function without making use of recursion techniques, since the purpose of dynamic programming is to optimize and accelerate the process, programmers usually make use of recursion techniques to accelerate and turn the process efficiently.
When a function can execute a specific task by calling itself, receive the name of the recursive function. In order to perform and accomplish the work, this function calls itself when it has to be executed.
Using dynamic programming, you can break a problem into smaller parts, called subproblems, to solve it. Dynamic programming involves solving the problem for the first time, then using memoization to store the solutions.
Therefore, the main difference between the two techniques is their intended use; recursion is used to automate a function, whereas dynamic programming is an optimization technique used to solve problems.
Recursive functions recognize when they are needed, execute themselves, then stop working. When the function identifies the moment it is needed, it calls itself and is executed; this is called a recursive case. As a result, the function must stop once the task is completed, known as the base case.
By establishing states, dynamic programming recognizes the problem and divides it into sub-problems in order to solve the whole scene. After solving these sub-problems, or variables, the programmer must establish a mathematical relationship between them. Last but not least, these solutions and results are stored as algorithms, so they can be accessed in the future without having to solve the whole problem again.

# Techniques to solve Dynamic Programming Problems:
1)Top down aproach memoization
2)bottom up aproach tabulation

# Steps to solve a Dynamic programming problem:

Identify if it is a Dynamic programming problem.
Decide a state expression with the Least parameters.
Formulate state and transition relationships.
Do tabulation (or memorization).