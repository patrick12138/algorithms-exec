package com.patrick.offer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
 */

/**
 * 通过linkedlist实现，linkedlist底层是双向链表
 */
public class CQueue {

    LinkedList<Integer> A, B;

    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if (!B.isEmpty()) return B.removeLast();
        if (A.isEmpty()) return -1;
        while (!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();
    }
}

/**
 * 通过栈实现
 */
class SQueue {
    Stack<Integer> A;
    Stack<Integer> B;

    public SQueue() {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
    }

    public void appendTail(int val) {
        A.push(val);
    }

    public int deleteHead() {
        // B不为空，将B的值弹出
        if (!B.isEmpty()) {
            return B.pop();
        }
        // A为空，返回-1
        // 注意：此处必须要放在下面，这是因为Stack操作会删除元素，此时A已经是空的了
        if (A.isEmpty()) {
            return -1;
        }
        /*
         A    B
        |-|  |-|
        |5|  |1|
        |4|  |2|
        |3|  |3|
        |2|  |4|
        |1|  |5|
         */
        // 运行到这说明，B为空，需要将A的值赋给B，形成了一次倒叙
        while (!A.isEmpty()) {
            B.push(A.pop());
        }
        return B.pop();
    }
}