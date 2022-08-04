package com.patrick.offer;

import com.patrick.list.ListNode;

import java.util.HashMap;

/**
 * https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class GetIntersectionNode {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        HashMap<Integer, Boolean> map = new HashMap<>();
        int i = 0, j = 0;
        for (int k = 0; k < 2; k++) {
            headA = headA.next;
        }
        for (int k = 0; k < 3; k++) {
            headB = headB.next;
        }
//        while (headA != null && headB != null) {
//            if (headA.val == headB.val) map.put(headA.val, true);
//
//
//        }
//        map.forEach((key,val)->{
//            System.out.println(key+"->"+val);
//        });
        return headA;
    }

    /**
     * 我们使用两个指针 node1，node2 分别指向两个链表 headA，headB 的头结点，
     * 然后同时分别逐结点遍历，当 node1 到达链表 headA 的末尾时，重新定位到链表 headB 的头结点；
     * 当 node2 到达链表 headB 的末尾时，重新定位到链表 headA 的头结点。
     * 这样，当它们相遇时，所指向的结点就是第一个公共结点。
     * <p>
     * 双指针，浪漫相遇解法 他真我哭
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode n1 = headA;
        ListNode n2 = headB;

        while (n1 != n2) {
            if (n1 == null) n1 = headB;
            else n1 = n1.next;

            if (n2 == null) n2 = headA;
            else n2 = n2.next;
        }
        return n1;
    }

    public static void main(String[] args) {

    }
}
