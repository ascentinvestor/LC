class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0; // ✅ carry instead of boolean isCarry

        // ✅ continue while l1 OR l2 exists OR carry exists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // ✅ node value should be single digit only
            current.next = new ListNode(sum % 10);

            // ✅ carry goes to next digit
            carry = sum / 10;

            current = current.next;
        }

        // ✅ return dummy.next, not dummy/current
        return dummy.next;
    }
}