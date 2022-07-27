package com.patrick.offer;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

/**
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。
 * 这个链表的倒数第 3 个节点是值为 4 的节点。
 */
public class GetKthFromEnd {
    /**
     * 自己写没解出来
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;

        ListNode currNode = head;
        int len = 1;
        while (currNode.next != null) {
            currNode = currNode.next;
            len++;
        }
        System.out.println(len);
        if (len == 1) return head;
        int curIndex = 1;
        ListNode listNode = new ListNode();
        while (head.next != null) {
            curIndex++;
            if (len - k == curIndex) {
                listNode = head.next.next;
            }
            head = head.next;
        }
        return listNode;
    }

    /**
     * 快慢指针
     * 时间复杂度 O(N)O(N) ： NN 为链表长度；总体看， former 走了 NN 步， latter 走了 (N-k)(N−k) 步。
     * 空间复杂度 O(1)O(1) ： 双指针 former , latter 使用常数大小的额外空间。
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++)
            former = former.next;
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    class Solution {
        /**
         * 简洁写法，主义k == 0 还可以继续走
         * @param head
         * @param k
         * @return
         */
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode fast = head;
            while (fast != null) {
                fast = fast.next;
                if (k == 0) {
                    head = head.next;
                } else {
                    k--;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        int[] arr = new int[]{1, 2, 3, 5, 7, 8};
        ListUtils.headCreatListByArr(listNode, arr);
        ListUtils.printList(listNode);
        System.out.println();
        ListUtils.printList(getKthFromEnd(listNode, 2));
    }
}
