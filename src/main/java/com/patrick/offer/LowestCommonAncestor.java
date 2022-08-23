package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;

/**
 * 二叉树
 * 二叉搜索树
 * 最近公共祖先
 */
public class LowestCommonAncestor {
    /**
     * 普通二叉树
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        BinaryTreeNode left = lowestCommonAncestor(root.left, p, q);
        BinaryTreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            // p q 一个在左，一个在右
            return root;
        }
        if (left != null) {
            // p q 都在左子树
            return left;
        }
        if (right != null) {
            // p q 都在右子树
            return right;
        }
        return null;
    }

    /**
     * 二叉搜索树
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public BinaryTreeNode lowestCommonAncestor1(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null)
            return null;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor1(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor1(root.right, p, q);
        return root;
    }
}
