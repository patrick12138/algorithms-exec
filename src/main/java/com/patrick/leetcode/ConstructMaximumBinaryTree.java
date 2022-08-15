package com.patrick.leetcode;

import com.patrick.tree.BinaryTreeNode;

/**
 * https://leetcode.cn/problems/maximum-binary-tree/
 * 给定一个不重复的整数数组nums 。最大二叉树可以用下面的算法从nums 递归地构建:
 * 创建一个根节点，其值为nums 中的最大值。
 * 递归地在最大值左边的子数组前缀上构建左子树。
 * 递归地在最大值 右边 的子数组后缀上构建右子树。
 * 返回nums 构建的 最大二叉树
 */
public class ConstructMaximumBinaryTree {
    public BinaryTreeNode constructMaximumBinaryTree(int[] nums) {
        return maxTree(nums, 0, nums.length - 1);
    }

    public BinaryTreeNode maxTree(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        //bond为当前数组中最大值的索引
        int maxIndex = findMax(nums, l, r);
        BinaryTreeNode root = new BinaryTreeNode(nums[maxIndex]);
        root.left = maxTree(nums, l, maxIndex - 1);
        root.right = maxTree(nums, maxIndex + 1, r);
        return root;
    }

    //找最大值的索引
    public int findMax(int[] nums, int l, int r) {
        int max = 0, maxIndex = l;
        for (int i = l; i <= r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
