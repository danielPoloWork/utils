package linkedList;

import java.util.Optional;

public class PrettyPrint {
    public void print(ListNode node) {
        StringBuilder out = new StringBuilder();

        if (Optional.ofNullable(node).isPresent()) {
            out.append(node.value);

            while (Optional.ofNullable(node.next).isPresent()) {
                out.append("->");
                node = node.next;
            }
        } else {
            out.append("Empty LinkedList");
        }
        System.out.println(out);
    }
}
