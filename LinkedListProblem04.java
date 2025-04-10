import java.util.HashMap;

public class LinkedListProblem04 {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;

        while (current != null) {
            Node newNode = map.get(current);
            newNode.next = map.get(current.next);
            newNode.random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);

    }
}
