package com.patrick.leetcode;

import com.patrick.tree.BinaryTreeNode;
import com.patrick.tree.TreeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个二叉树 根节点root，树的每个节点的值要么是 0，要么是 1。请剪除该二叉树中所有节点的值为 0 的子树。
 *
 * 节点 node 的子树为node 本身，以及所有 node的后代。
 */
public class BinaryTreePruning {
    /**
     * 优雅写法
     *
     * @param root
     * @return
     */
    public static BinaryTreeNode pruneTree(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }

    public BinaryTreeNode pruneTreeByPatrick() {
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        BinaryTreeNode biTree = TreeUtils.createBiTree(arr);
        BinaryTreeNode biTreeByPrune = pruneTree(biTree);
        TreeUtils.preorderTraversal(biTreeByPrune,arrayList).forEach(System.out::println);
    }
}
