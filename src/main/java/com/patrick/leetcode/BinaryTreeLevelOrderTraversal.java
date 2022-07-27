package com.patrick.leetcode;

import com.patrick.tree.BinaryTreeNode;
import com.patrick.tree.TreeUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(BinaryTreeNode root) {
        if (root == null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();                        /* 初始化空队列 */
        queue.add(root);                 /* 根结点指针入队列 */
        while(!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> arrayList = new ArrayList<>();
            while (count > 0){
                BinaryTreeNode node = queue.poll();/* 队头元素出队列 */
                arrayList.add(node.getVal());
                if(node.left != null) queue.add(node.left); /* 左子树根结点指针入队列 */
                if(node.right != null) queue.add(node.right); /* 右子树根结点指针入队列 */
                count--;
            }
            lists.add(arrayList);
        }
        return lists;
    }

    public static void main(String[] args) {
        int [] arr = {3,9,20,50,7};
        BinaryTreeNode biTree = TreeUtils.createBiTree(arr);
        List<List<Integer>> lists = levelOrder(biTree);
        lists.forEach(System.out::println);
    }
}
