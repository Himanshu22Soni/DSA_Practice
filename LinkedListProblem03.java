// import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;

public class LinkedListProblem03 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.val);
            } else {
                System.out.print(current.val + " -> ");
            }
            current = current.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        ListNode next = head != null ? head.next : null;
        while (current != null && next != null) {
            // Swap the pairs
            current.next = next.next;
            next.next = current;
            prev.next = next;

            // Move to the next pair
            prev = current;
            current = current.next;
            next = current != null ? current.next : null;
        }
        return dummy.next;
    }

    public static int getDecimalValue(ListNode head) {
        String binaryString = "";
        ListNode current = head;
        while (current != null) {
            binaryString += current.val;
            current = current.next;
        }
        return Integer.parseInt(binaryString, 2);
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int[] arr = new int[10000];
        int i = 1;
        int j = 0;
        ListNode current = head;
        while (current != null) {
            if (i % 2 != 0) {
                arr[j] = current.val;
                j++;
            }
            current = current.next;
            i++;
        }
        ListNode current2 = head;
        i = 1;
        j = j + 1;

        while (current2 != null) {
            if (i % 2 == 0) {
                arr[j] = current2.val;
                j++;
            }
            current2 = current2.next;
            i++;
        }

        ListNode head2 = new ListNode(arr[0]);
        ListNode current3 = head2;
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] != 0) {
                current3.next = new ListNode(arr[k]);
                current3 = current3.next;
            }
        }
        return head2;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == 0 || count == 1) {
            return head;
        }
        k = k % count;
        if (k == 0) {
            return head;
        }
        ListNode current = head;
        while (k > 0) {
            while (current.next.next != null) {
                current = current.next;
            }
            current.next.next = head;
            head = current.next;
            current.next = null;
            k--;
            current = head;
        }
        return head;
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smallHead = small;
        ListNode largeHead = large;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                small.next = temp;
                small = small.next;
            } else {
                large.next = temp;
                large = large.next;
            }
            temp = temp.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode pointer = head;
                while (pointer != slow) {
                    pointer = pointer.next;
                    slow = slow.next;
                }
                return pointer;
            }
        }
        return null;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1)
            return head;
        int count = 0;
        ListNode temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count == k) {
            ListNode prev = null;
            ListNode current = head;
            ListNode next = null;
            count = 0;
            while (count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            return prev;
        }
        return head;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (ListNode list : lists) {
            ListNode current = list;
            while (current != null) {
                arr.add(current.val);
                current = current.next;
            }
        }
        arr.sort(Integer::compareTo);
        ListNode head = new ListNode(0);
        ListNode current = head;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return head.next;
    }

    // public static ListNode doubleIt(ListNode head) {
    // int num = 0;

    // }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // ListNode current = head;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // while (current != null) {
        // map.put(current.val, map.getOrDefault(current.val, 0) + 1);
        // current = current.next;
        // }
        // ListNode dummy = new ListNode(0);
        // ListNode current2 = dummy;
        // current = head;
        // while (current != null) {
        // if (map.get(current.val) == 1) {
        // current2.next = new ListNode(current.val);
        // current2 = current2.next;
        // }
        // current = current.next;
        // }
        // return dummy.next;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            if (prev.next == head) {
                prev = prev.next;
            } else {
                prev.next = head.next;
            }
            head = head.next;
        }
        return dummy.next;

    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left, right);
    }

    public static ListNode getMiddle(ListNode head) {
        if (head == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null)
            prev.next = null;
        return slow;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return dummy.next;

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move `prev` to the node just before `left`
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start reversing from `curr`
        ListNode LeftNode = prev.next;
        ListNode RightNode = LeftNode;
        for (int i = left; i < right; i++) {
            if (RightNode == null)
                return head;
            RightNode = RightNode.next;
        }

        ListNode next = RightNode.next;

        // Reverse the sublist from LeftNode to RightNode
        ListNode reversedHead = reverseCustomList(LeftNode, RightNode);

        // Connect back to the list
        prev.next = reversedHead;
        LeftNode.next = next;

        return dummy.next;
    }

    public static ListNode reverseCustomList(ListNode start, ListNode end) {
        if (start == null || end == null)
            return start;
        ListNode prev = null;
        ListNode curr = start;
        ListNode next = null;

        ListNode stop = end.next;
        while (curr != stop) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        if (l1.val == 0 && l2.val == 0) {
            return new ListNode(0);
        }
        if (l1.val == 0) {
            return l2;
        } else if (l2.val == 0) {
            return l1;
        }

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        while (l1 != null) {
            num1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            num2.append(l2.val);
            l2 = l2.next;
        }
        BigInteger sum = new BigInteger(num1.toString()).add(new BigInteger(num2.toString()));
        String sumStr = sum.toString();
        System.out.println(sumStr);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 0; i < sumStr.length(); i++) {
            current.next = new ListNode(Character.getNumericValue(sumStr.charAt(i)));
            current = current.next;
        }
        return dummy.next;
    }

    public static ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        if (count == 0 || count == 1) {
            return head;
        }
        if (k > count) {
            return head;
        }
        ListNode front = head;
        ListNode back = head;
        ListNode frontPrev = null;
        ListNode backPrev = null;
        for (int i = 0; i < k - 1; i++) {
            frontPrev = front;
            front = front.next;
        }
        for (int i = 0; i < count - k; i++) {
            backPrev = back;
            back = back.next;
        }
        if (front == back) {
            return head;
        }
        if (frontPrev != null) {
            frontPrev.next = back;
        } else {
            head = back;
        }
        if (backPrev != null) {
            backPrev.next = front;
        } else {
            head = front;
        }
        ListNode temp = front.next;
        front.next = back.next;
        back.next = temp;
        return head;
    }

    public static void main(String[] args) {
        // int[] num1 = { 7, 2, 4, 3 };
        // int[] num2 = { 5, 6, 4 };
        int[] arr = { 7, 9, 6, 6, 7, 8, 3, 0, 9, 5 };
        // int[] arr2 = { 1, 0, 1 };
        // ListNode head = createLinkedList(num1);
        // ListNode head2 = createLinkedList(num2);
        ListNode head3 = createLinkedList(arr);
        // printLinkedList(head);
        // System.out.println();
        // printLinkedList(swapPairs(head));
        // System.out.println();
        // System.out.println(getDecimalValue(head));
        // printLinkedList(oddEvenList(head));
        // System.out.println();
        // printLinkedList(rotateRight(head, 4));
        // printLinkedList(reverseBetween(head, 2, 5));
        // printLinkedList(addTwoNumbers(head, head2));
        printLinkedList(swapNodes(head3, 5));
        System.out.println();

    }
}
