package com.patrick.offer;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

/**
 * 力扣002
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 */
public class AddTwoNumbers {
    /**
     * 孙哥的解可以的，通俗易懂
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0), cur = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(carry % 10);
            cur = cur.next;
            carry /= 10;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 8, 9};
        int[] arr2 = {4, 7, 6};
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListUtils.tailCreatListByArr(l1, arr1);
        ListUtils.tailCreatListByArr(l2, arr2);
        ListUtils.printList(addTwoNumbers(l1, l2));
    }
}
