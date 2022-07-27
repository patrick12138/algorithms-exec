package com.patrick.offer;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 尾结点一定是null
 */
public class ReverseList {
    /**
     * 双指针（迭代）
     * 时间复杂度 O(N)O(N) ： 遍历链表使用线性大小时间。
     * 空间复杂度 O(1)O(1) ： 变量 pre 和 cur 使用常数大小额外空间。
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode tmp = cur.next; // 暂存后继节点 cur.next
            cur.next = pre;          // 修改 next 引用指向
            pre = cur;               // pre 暂存 cur
            cur = tmp;               // cur 访问下一节点
        }
        return pre;
    }

    /**
     * 递归
     * 时间复杂度 O(N)O(N) ： 遍历链表使用线性大小时间。
     * 空间复杂度 O(N)O(N) ： 遍历链表的递归深度达到 NN ，系统使用 O(N)O(N) 大小额外空间。
     *
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        ListNode listNode = new ListNode();
        ListUtils.tailCreatListByArr(listNode,arr);
        ListNode listNode1 = reverseList1(listNode);
        ListUtils.printList(listNode1);
    }
}
