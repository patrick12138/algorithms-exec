package com.patrick.tree;

import lombok.Data;

import java.util.List;

@Data
public class TreeNode {
    public int val;
    public List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(int _val) {
        val = _val;
    }

    public TreeNode(int _val, List<TreeNode> _children) {
        val = _val;
        children = _children;
    }
}
