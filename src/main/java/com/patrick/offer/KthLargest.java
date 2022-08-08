package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;

/**
 * https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 */
public class KthLargest {
    private int ans = 0, count = 0;

    public int kthLargest(BinaryTreeNode root, int k) {
        helper(root, k);
        return ans;
    }

    private void helper(BinaryTreeNode root, int k) {
        if (root.right != null) helper(root.right, k);
        if (++count == k) {
            ans = root.val;
            return;
        }
        if (root.left != null) helper(root.left, k);
    }

    public static void main(String[] args) {

    }
}
