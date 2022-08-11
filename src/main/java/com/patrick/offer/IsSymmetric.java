package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;

/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树[1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *   /  \
 *  2   2
 * / \ / \
 * 3 4 4 3
 * 但是下面这个[1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *   1
 *  / \
 *  2  2
 *  \  \
 *  3  3
 */
public class IsSymmetric {
    /**
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(BinaryTreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }

    public boolean helper(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.val == root2.val && helper(root1.left, root2.right) && helper(root1.right, root2.left);
    }
}
