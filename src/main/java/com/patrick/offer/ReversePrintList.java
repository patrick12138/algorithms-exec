package com.patrick.offer;

import com.patrick.list.ListNode;
import com.patrick.list.ListUtils;

import java.util.ArrayList;

/**
 * 逆序打印链表
 */
public class ReversePrintList {
    public static ArrayList<Integer> tempArrayList = new ArrayList<>();

    public static int[] reversePrint(ListNode head) {
        if (head == null || head.val == 0) {
            return new int[0];
        }
        //先获取链表长度，创建对应长度数组
        ListNode currNode = head;
        int i, len;
        for (len = 0; currNode != null; currNode = currNode.next, len++);
        int[] res = new int[len];
        for (i = len - 1; head != null; head = head.next, i--) res[i] = head.val;
        return res;
    }

    /**
     * 先获取链表长度，创建对应长度数组
     *
     * @param head
     */
    public static int[] reversePrint1(ListNode head) {
        //先获取链表长度，创建对应长度数组
        ListNode currNode = head;
        int len = 0;
        while (currNode != null) {
            len++;
            currNode = currNode.next;
        }
        int[] result = new int[len];
        //再次遍历链表，将值倒序填充至结果数组
        while (head != null) {
            result[len - 1] = head.val;
            len--;
            head = head.next;
        }
        return result;
    }

    /**
     * 递归完成
     * 时间复杂度 O(N)O(N)： 遍历链表，递归 NN 次。
     * 空间复杂度 O(N)O(N)： 系统递归需要使用 O(N)O(N) 的栈空间。
     *
     * @param head
     * @return
     */
    public static int[] reversePrint2(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        reversePrint2(head.next);
        tempArrayList.add(head.val);
        int[] res = new int[tempArrayList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tempArrayList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        int[] arr = new int[]{3, 5, 7};
        ListUtils.tailCreatListByArr(listNode, arr);
        for (int i : reversePrint(listNode)) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : reversePrint1(listNode)) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : reversePrint2(listNode)) {
            System.out.print(i);
        }
        System.out.println();
        ListUtils.printList(listNode);
    }
}
