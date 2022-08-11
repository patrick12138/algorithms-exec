package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;
import com.patrick.tree.TreeUtils;

import java.util.Iterator;
import java.util.List;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *     4
 *   /   \
 *  2    7
 * / \  / \
 * 1  3 6  9
 *
 * 镜像输出：
 *     4
 *   /  \
 *  7    2
 * / \  / \
 *9  6 3  1
 */
public class MirrorTree {
    public BinaryTreeNode mirrorTree(BinaryTreeNode root) {
        if (root == null)return null;
        BinaryTreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        int [] arr = {7,8,1,2,3,4,5,6};
        BinaryTreeNode biTree = TreeUtils.createBiTree(arr);
    }
}
