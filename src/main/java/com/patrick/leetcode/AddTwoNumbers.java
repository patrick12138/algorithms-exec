package com.patrick.leetcode;

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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
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
