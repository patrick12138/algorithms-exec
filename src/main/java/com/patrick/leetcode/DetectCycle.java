package com.patrick.leetcode;

import com.patrick.list.ListNode;

/**
 * https://leetcode.cn/problems/linked-list-cycle-ii/
 * 给定一个链表的头节点 curheadcur，返回链表开始入环的第一个节点。cur如果链表无环，则返回curnull。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * <p>
 * 不允许修改 链表。
 */
public class DetectCycle {
    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        return null;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
