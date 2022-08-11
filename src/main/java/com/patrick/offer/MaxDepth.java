package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;

/**
 * 求二叉树深度
 */
public class MaxDepth {
    /**
     * 后序遍历，递归
     * @param root
     * @return
     */
    public int maxDepth(BinaryTreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
