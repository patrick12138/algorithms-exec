package com.patrick.list;

public class ListUtils {
    /**
     * 尾插法生成单链表
     *
     * @param l
     * @param arr
     * @return
     */
    public static void tailCreatListByArr(ListNode l, int[] arr) {
        ListNode s, r;//s用来指向新、生成的节点。r始终指向L的终端节点。
        l.val = arr[0];
        r = l; //r指向了头节点，此时的头节点是终端节点。
        for (int i = 1; i < arr.length; i++) {
            s = new ListNode();//s指向新申请的节点
            s.val = arr[i];//赋值
            r.next = s;
            r = s;
        }
        r.next = null; //元素已经全部装入链表L中
        //L的终端节点指针域为NULL，L建立完成
    }

    /**
     * 头插法生成单链表
     *
     * @param l
     * @param arr
     */
    public static void headCreatListByArr(ListNode l, int[] arr) {
        ListNode s; //不用像尾插法一样生成一个终端节点。
        l.val = arr[0];
        l.next = null;//定好尾巴
        for (int i = 1; i < arr.length; i++) {
            s = new ListNode();
            s.val = arr[i];
            s.next = l.next; //将L指向的地址赋值给S;//头插法与尾插法的不同之处主要在此，
            //s所指的新节点的指针域next指向L中的开始节点
            l.next = s; //头指针的指针域next指向s节点，使得s成为开始节点。
        }
    }

    /**
     * 打印链表
     *
     * @param l
     */
    public static void printList(ListNode l) {
        ListNode p = l;
        while (p != null) {
            if (p.next == null) {
                System.out.print(p.val);
                break;
            }
            System.out.print(p.val + "->");
            p = p.next;
        }
    }
}
