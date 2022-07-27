package com.patrick.test;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

public class CopyList {
    public static ListNode copyList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        // 1. 复制各节点，并构建拼接链表
        while (cur != null) {
            ListNode tmp = new ListNode(cur.val);
            tmp.next = cur.next; //按顺序插入
            cur.next = tmp;
            cur = tmp.next;
        }
        // 2. 拆分两链表
        cur = head.next;
        ListNode pre = head, res = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null; // 单独处理原链表尾节点
        return res;      // 返回新链表头节点
    }

    public static ListNode copyList1(ListNode head) {
        ListNode cur = head;
        ListNode dum = new ListNode(0), pre = dum;
        while (cur != null) {
            ListNode node = new ListNode(cur.val); // 复制节点 cur
            pre.next = node;               // 新链表的 前驱节点 -> 当前节点
            cur = cur.next;                // 遍历下一节点
            pre = node;                    // 保存当前新节点
        }
        return dum.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ListNode listNode = new ListNode();
        ListUtils.tailCreatListByArr(listNode, arr);
        ListNode listNode1 = copyList(listNode);
        ListNode listNode2 = copyList1(listNode);
        ListUtils.printList(listNode);
        System.out.println();
        ListUtils.printList(listNode1);
        System.out.println();
        ListUtils.printList(listNode2);
    }
}
