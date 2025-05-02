class Solution {
    public int findLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1, len2;
        len1 = findLen(l1);
        len2 = findLen(l2);

        int len = (len1 < len2) ? len1 : len2;
        ListNode large = (len1 < len2) ? l2 : l1;
        ListNode small = (len1 < len2) ? l1 : l2;
        ListNode start = large;

        int carry = 0;
        for (int i = 0; i < len; i++) {
            int sum = large.val + small.val + carry;
            large.val = sum % 10;
            carry = sum / 10;
            large = large.next;
            small = small.next;
        }

        if (carry != 0) {
            while (large != null) {
                int sum = large.val + carry;
                large.val = sum % 10;
                carry = sum / 10;
                if (carry == 0)
                    return start;
                large = large.next;
            }

            if (carry != 0) {
                ListNode last = start;
                while (last.next != null) {
                    last = last.next;
                }

                ListNode newNode = new ListNode(carry);
                newNode.next = null;
                last.next = newNode;
            }
        }
        return start;
    }
}