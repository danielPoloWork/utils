package binaryTree;

import java.util.Optional;

public class PrettyPrintTreeNode {

    private final StringBuilder out = new StringBuilder();

    public void println(TreeNode node) {
        println(node, true);
    }
    public void println(TreeNode node, boolean isLeft) {
        if (Optional.ofNullable(node).isEmpty()) {
            out.append("Empty tree");
        } else if (Optional.ofNullable(node.right).isPresent()) {
            out.append(isLeft ? "│   " : "    ");
            println(node.right, false);
            out.append(isLeft ? "└── " : "┌── ")
               .append(node.value);
        } else if (Optional.ofNullable(node.left).isPresent()) {
            out.append(isLeft ? "    " : "│   ");
            println(node.left,true);
        }
        System.out.println(out);
    }
}
