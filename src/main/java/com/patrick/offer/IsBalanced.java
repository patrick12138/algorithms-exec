package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;

/**
 * https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class IsBalanced {
    public boolean isBalanced(BinaryTreeNode root) {
        if (root == null) return true;
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1)
            return isBalanced(root.left) && isBalanced(root.right);
        return false;
    }

    public int maxDepth(BinaryTreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
