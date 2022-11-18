package binaryTree;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class InputString {

    public Optional<TreeNode> toTreeNode(String input) {
        input = input.trim().substring(1, input.length() - 1);

        if (input.length() == 0) {
            return Optional.empty();
        } else {
            String[] treeParts = input.split(",");
            String nodeItem = treeParts[0];
            TreeNode nodeRoot = new TreeNode(Integer.parseInt(nodeItem));
            Queue<TreeNode> nodeQueue = new LinkedList<>();
            nodeQueue.add(nodeRoot);

            whileThereAreNodes(nodeQueue, treeParts, nodeItem);

            return Optional.of(nodeRoot);
        }
    }

    private void whileThereAreNodes(Queue<TreeNode> nodeQueue, String[] treeParts, String nodeItem) {
        int index = 1;

        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index < treeParts.length) {
                nodeItem = treeParts[index++].trim();

                if (!nodeItem.equals("null")) {
                    int leftNumber = Integer.parseInt(nodeItem);
                    node.left = new TreeNode(leftNumber);
                    nodeQueue.add(node.left);
                }

                if (index < treeParts.length) {
                    nodeItem = treeParts[index++].trim();

                    if (!nodeItem.equals("null")) {
                        int rightNumber = Integer.parseInt(nodeItem);
                        node.right = new TreeNode(rightNumber);
                        nodeQueue.add(node.right);
                    }
                }
            }
        }
    }
}
