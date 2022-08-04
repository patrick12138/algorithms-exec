package com.patrick.offer;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */
public class MergeTwoLists {
    /**
     * 伪头结点
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) pre.next = l1;
        if (l2 != null) pre.next = l2;
        return dummyHead.next;
    }

    /**
     * 递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4};
        int[] arr2 = {1, 2, 5};
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListUtils.tailCreatListByArr(listNode1, arr1);
        ListUtils.tailCreatListByArr(listNode2, arr2);
        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        ListUtils.printList(listNode);
    }
}
