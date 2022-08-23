package com.patrick.leetcode;

import com.patrick.list.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 排序链表
 */
public class SortList {
    /**
     * 简单解法
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dum = new ListNode(0);
        ListNode cur1 = dum;
        ListNode cur = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (cur != null) {
            arrayList.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            ListNode node = new ListNode(arrayList.get(i));
            cur1.next = node;
            cur1 = cur1.next;
        }
        cur1.next = null;
        return dum.next;
    }
    /**
     *  归并排序
     */

}
