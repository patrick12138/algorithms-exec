package com.patrick.leetcode;

import com.patrick.tree.BinaryTreeNode;

/**
 * 翻转二叉树
 */
public class InvertTree {
    /**
     * 前序遍历
     * @param root
     * @return
     */
    public BinaryTreeNode invertTree(BinaryTreeNode root) {
        if (root == null) return null;
        BinaryTreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}
