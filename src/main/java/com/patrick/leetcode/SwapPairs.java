package com.patrick.leetcode;

import com.patrick.list.ListNode;

public class SwapPairs {
    /**
     *
     * @param head
     * @return
     */
    public ListNode swapPairs1(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = dummyNode;

        while (cur.next != null && cur.next.next != null) {
            ListNode temp = head.next.next; // 缓存 next
            cur.next = head.next;          // 将 cur 的 next 改为 head 的 next
            head.next.next = head;          // 将 head.next(cur.next) 的next，指向 head
            head.next = temp;               // 将head 的 next 接上缓存的temp
            cur = head;                    // 步进1位
            head = head.next;               // 步进1位
        }
        return dummyNode.next;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {

    }
}
