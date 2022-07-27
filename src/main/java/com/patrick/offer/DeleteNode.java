package com.patrick.offer;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class DeleteNode {
    /**
     * 双指针
     * 空间O(1)
     * successor
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode1(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;//定位节点
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) pre.next = cur.next;
        return head;
    }

    /**
     * 自己写的，但是错
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val)  cur.next = cur.next.next;
            cur = cur.next;
        }
        return head;
    }

    /**
     * 单指针
     * 真的很细
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode2(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        int[] arr = new int[]{-3, 1, 2, 3, 4, 5};
        ListUtils.headCreatListByArr(listNode, arr);
        deleteNode(listNode, -3);
        ListUtils.printList(listNode);
    }
}
