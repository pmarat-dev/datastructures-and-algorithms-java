package neetcode.linkedlist.reverselist;

import static java.lang.System.out;

public class Solution {
    static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode tempNode;

        while (current != null) {
            tempNode = current.next;
            current.next = previous;
            previous = current;
            current = tempNode;
        }

        return previous;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        ListNode reversed = reverseList(list);
        out.format("Reversed list: %s", reversed);
    }
}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
