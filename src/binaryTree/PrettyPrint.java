package binaryTree;

import java.util.Optional;

public class PrettyPrint {

    private final StringBuilder out = new StringBuilder();

    public void print(TreeNode node) {
        print(node, true);
    }
    public void print(TreeNode node, boolean isLeft) {
        if (Optional.ofNullable(node).isEmpty()) {
            out.append("Empty tree");
        } else {
            if (Optional.ofNullable(node.right).isPresent()) {
                out.append(isLeft ? "│   " : "    ");
                print(node.right, false);
            }

            out.append(isLeft ? "└── " : "┌── ")
               .append(node.value);

            if (Optional.ofNullable(node.left).isPresent()) {
                out.append(isLeft ? "    " : "│   ");
                print(node.left, true);
            }
        }

        System.out.println(out);
    }
}
