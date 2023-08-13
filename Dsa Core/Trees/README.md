### Trees


- Step 1: Define the TreeNode class to represent each node in the binary tree. Each node has a value (`val`) and two references to its left and right children.

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
```

- Step 2: Create the BinaryTree class, which will have a reference to the root node (`TreeNode`) and methods to add nodes to the tree.

```java
public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }
}
```

- Step 3: Add a method to the BinaryTree class to add nodes to the tree.

```java
public void addNode(int val) {
    root = addNodeRecursive(root, val);
}

private TreeNode addNodeRecursive(TreeNode current, int val) {
    if (current == null) {
        return new TreeNode(val);
    }

    if (val < current.val) {
        current.left = addNodeRecursive(current.left, val);
    } else if (val > current.val) {
        current.right = addNodeRecursive(current.right, val);
    }

    return current;
}
```

In the `addNode` method, we start with the root node and call the `addNodeRecursive` method, passing the root and the value to be inserted. The `addNodeRecursive` method is a helper method that handles the recursive insertion of nodes based on their values. If the current node is `null`, it means we have found the correct position to insert the new node with the given value. Otherwise, we compare the value with the current node's value and proceed either to the left or right subtree accordingly until we find the appropriate position.

- Step 4: Test the BinaryTree implementation by creating a binary tree and adding nodes to it.

```java
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(8);
        tree.addNode(1);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(9);
    }
}
```

In the `Main` class, we create a `BinaryTree` instance and add nodes with values 5, 3, 8, 1, 4, 7, and 9 to the tree. The binary tree will be structured accordingly:

```
      5
     / \
    3   8
   / \ / \
  1  4 7  9
```

That's it! You now have a clear implementation of a binary tree in Java. By adding more methods and functionalities, you can explore more complex tree structures and algorithms. If you have any further questions or need additional clarification, feel free to ask!


## practise questions 

1. **Tree Traversal:**
   Given the root of a binary tree, implement methods to perform the following traversals:
   - Pre-order traversal: root - left - right
   - In-order traversal: left - root - right
   - Post-order traversal: left - right - root

2. **Binary Search Tree Validation:**
   Write a function to check if a given binary tree is a valid binary search tree (BST).

3. **Height of Binary Tree:**
   Write a function to calculate the height (maximum depth) of a binary tree.

4. **Level Order Traversal:**
   Given the root of a binary tree, implement a method to perform a level-order traversal and return the nodes' values in a list, level by level.

5. **Symmetric Tree:**
   Write a function to determine if a binary tree is symmetric (mirror image of itself).

6. **Lowest Common Ancestor (LCA):**
   Given the root of a binary tree and two nodes, find the lowest common ancestor of those two nodes.

7. **Binary Tree Paths:**
   Given a binary tree, return all root-to-leaf paths as an array of strings.

8. **Serialize and Deserialize Binary Tree:**
   Implement functions to serialize a binary tree into a string representation and deserialize it back to a binary tree.

9. **Diameter of Binary Tree:**
   Given a binary tree, calculate the diameter (longest path between any two nodes) of the tree.

10. **Count Complete Tree Nodes:**
    Given a complete binary tree, count the total number of nodes.

These are some introductory coding questions that will help you practice various aspects of tree manipulation and traversal. Start with simpler problems and gradually move on to more complex ones as you gain confidence. Happy coding! If you need any help with solving any of these questions, feel free to ask for guidance.