package com.patrick.tree;

import com.patrick.singleton.EagerSingleton;
import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class TreeUtils {
    private static final List<Integer> lists = new ArrayList<>();
    private static final List<Integer> res = new ArrayList<>();

    /**
     * 构建二叉树
     * BinaryTreeNode 为结点,
     * data 为数据
     */
    public static void buildBiTree(BinaryTreeNode node, int data) {
        //如果根结点是空,那么设置根结点,并且设置数据域
        if (node.getVal() == 0) {
            node.setVal(data);
        } else {
            /**
             * 根结点不为空,那么判断数据是否小于当前结点的数据
             */
            if (data < node.getVal()) {
                //如果小于,判断当前结点是否有左叶子结点
                if (node.getLeft() == null) {
                    //左叶子结点为空,设置左叶子结点,并且设置数据
                    node.setLeft(new BinaryTreeNode(data));
                } else {
                    //左叶子结点不为空,递归调用构建二叉树的函数
                    buildBiTree(node.getLeft(), data);
                }
            } else {
                //如果大于或等于,判断当前结点是否存在右叶子结点
                if (node.getRight() == null) {
                    //右叶子结点为空,设置右叶子结点,并且设置数据域
                    node.setRight(new BinaryTreeNode(data));
                } else {
                    //右叶子几点不为空,递归调用构建二叉树的函数
                    buildBiTree(node.getRight(), data);
                }
            }
        }
    }

    /**
     * 创建二叉树函数
     * int[] 是个int类型的数组
     * 通过循环调用,往二叉树插入数据
     */
    public static BinaryTreeNode createBiTree(int[] datas) {
        BinaryTreeNode binaryTree = new BinaryTreeNode();
        for (int data : datas) {
            buildBiTree(binaryTree, data);
        }
        return binaryTree;
    }

    /**
     * 前序遍历二叉树
     *
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(BinaryTreeNode root, List<Integer> res1) {
        if (root == null) return null;
        res.add(root.val);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
        return res;
    }

    /**
     * 非递归版 前序遍历N叉树
     *
     * @param root
     * @return
     */
    public List<Integer> preorder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null)
            return res;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }
        return res;
    }

    /**
     * 非递归版，中序遍历二叉树
     *
     * @param root
     */
    public static void inOrderTraversal(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();  /* 初始化一个栈 */
        while (root != null || !stack.isEmpty()) {        /* 当p为空且栈为空时算法结束 */
            while (root != null) {
                stack.push(root);
                root = root.left;                   /* 沿左指针走，沿途经过的(子树)根结点指针进栈 */
            }
            root = stack.pop();
            /* 当左指针为空时弹栈并访问该结点(子树根结点) */
            lists.add(root.val);
            root = root.right;                     /* 向右跳一步到右子树上继续进行遍历过程 */
        }
    }

    /**
     * 非递归版，后序遍历二叉树
     *
     * @param root
     */
    public static List<Integer> postOrderTraversal(BinaryTreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode q;
        q = null;
        while (root != null || !stack.isEmpty()) {
            if (root != q) {
                while (root != null) {
                    stack.push(root);                 /* p非空时，压栈 */
                    if (root.left != null) root = root.left; /* 沿左指针下移*/
                    else root = root.right;          /*若左指针为空，则沿右指针下移 */
                }
            }
            if (stack.isEmpty()) break;         /* 若栈空，则结束 */
            q = stack.peek();                   /* 取栈顶指针送q，*/
            if (q.right == root) {             /* 若q的右指针为空(p为空时)或指向刚刚访问过的结点 */
                root = stack.pop();                    /* 则弹栈并访问该结点 */
                res.add(root.val);
            } else root = q.right;            /* 否则，沿q的右指针继续遍历访问 */
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 1, 0, 1, 1};
        BinaryTreeNode tree = createBiTree(arr);
        inOrderTraversal(tree);
        lists.forEach(System.out::print);
        System.out.println();
        preorderTraversal(tree,res).forEach(System.out::print);
        System.out.println();
        postOrderTraversal(tree).forEach(System.out::print);
    }
}
