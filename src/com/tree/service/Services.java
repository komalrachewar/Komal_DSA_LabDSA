package com.tree.service;

import java.util.HashSet;

public class Services {

    public Node insert(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }
        if(val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public boolean findPairUtil(Node root, int sum, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }
        int complement = sum - root.data;
        if (set.contains(complement)) {
            System.out.println("Pair found: (" + root.data + ", " + complement + ")");
            return true;
        }
        set.add(root.data);
        boolean leftResult = findPairUtil(root.left, sum, set);
        if (leftResult) {
            return true;
        }
        return findPairUtil(root.right, sum, set);
    }

    public void findPairWithSum(Node root, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        if(!findPairUtil(root, sum, set)) {
            System.out.println("not exit");
        }
    }

}
