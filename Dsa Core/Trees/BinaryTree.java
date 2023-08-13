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

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

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

public void printTreeInOrder(TreeNode node) {
    if (node == null) {
        return;
    }

    printTreeInOrder(node.left);
    System.out.print(node.val + " ");
    printTreeInOrder(node.right);
}
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(8);
        tree.addNode(1);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(9);
        System.out.println("Binary Tree In-Order Traversal:");
        tree.printTreeInOrder(tree.root);
    }
}
