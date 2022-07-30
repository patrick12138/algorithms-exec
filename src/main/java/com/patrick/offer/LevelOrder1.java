package com.patrick.offer;

import com.patrick.tree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
public class LevelOrder1 {
    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    public int[] levelOrder(BinaryTreeNode root) {
        if (root == null) return new int[0];
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>() {{
            add(root);
        }};
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            res[i] = ans.get(i);
        return res;
    }

    public static void main(String[] args) {

    }
}
