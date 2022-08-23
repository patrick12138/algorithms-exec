package com.patrick.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 */
public class VerifyPostorder {
    List<Integer> arrayList = new ArrayList<>();

    public boolean verifyPostorder(int[] postorder) {
        for (int i : postorder) {
            System.out.println(i);
        }
        return false;
    }

    public boolean verifyPostorder1(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;
            while (!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
