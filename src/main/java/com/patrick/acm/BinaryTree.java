package com.patrick.acm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    // 节点类
    static class TreeNode {
        // 节点值
        int val;
        // 左节点
        TreeNode left;
        // 右节点
        TreeNode right;

        // 节点的构造函数(默认左右节点都为null)
        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * 根据数组构建二叉树
     *
     * @param arr 树的数组表示
     * @return 构建成功后树的根节点
     */
    public TreeNode constructBinaryTree(final int[] arr) {
        // 构建和原数组相同的树节点列表
        List<TreeNode> treeNodeList = arr.length > 0 ? new ArrayList<>(arr.length) : null;
        TreeNode root = null;
        // 把输入数值数组，先转化为二叉树节点列表
        for (int i = 0; i < arr.length; i++) {
            TreeNode node = null;
            if (arr[i] != -1) { // 用 -1 表示null
                node = new TreeNode(arr[i]);
            }
            treeNodeList.add(node);
            if (i == 0) {
                root = node;
            }
        }
        // 遍历一遍，根据规则左右孩子赋值就可以了
        // 注意这里 结束规则是 i * 2 + 2 < arr.length，避免空指针
        for (int i = 0; i * 2 + 2 < arr.length; i++) {
            TreeNode node = treeNodeList.get(i);
            if (node != null) {
                // 线性存储转连式存储关键逻辑
                node.left = treeNodeList.get(2 * i + 1);
                node.right = treeNodeList.get(2 * i + 2);
            }
        }
        return root;
    }
}