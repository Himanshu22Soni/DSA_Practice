public class LinkedListTutorial {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        while (head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
