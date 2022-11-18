package binaryTree;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class NodeRoot {

    public Optional<String> toString(TreeNode nodeRoot) {
        StringBuilder output = new StringBuilder();

        if (Optional.ofNullable(nodeRoot).isPresent()) {
            Queue<TreeNode> nodeQueue = new LinkedList<>();
            nodeQueue.add(nodeRoot);

            while(!nodeQueue.isEmpty()) {
                TreeNode node = nodeQueue.remove();

                if (Optional.ofNullable(node).isEmpty()) {
                    output.append("null, ");
                } else {
                    output.append(node.value)
                          .append(", ");
                    nodeQueue.add(node.left);
                    nodeQueue.add(node.right);
                }
            }
            output.append("[")
                  .append(output.substring(0, output.length() - 2))
                  .append("]");

            return Optional.of(output.toString());
        } else {
            return Optional.empty();
        }
    }
}