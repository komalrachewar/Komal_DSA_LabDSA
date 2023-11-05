package com.tree.main;

import com.tree.service.Node;
import com.tree.service.Services;

public class DriverMain {
    public static void main(String[] args) {
        Node root = null;
        Services sumPair = new Services();
//        root = new Node(40);
//        root.left = new Node(20);
//        root.right = new Node(60);
//        root.left.left = new Node(10);
//        root.left.right = new Node(30);
//        root.right.left = new Node(50);
//        root.right.right = new Node(70);
        root = sumPair.insert(root, 40);
        root = sumPair.insert(root, 20);
        root = sumPair.insert(root, 60);
        root = sumPair.insert(root, 10);
        root = sumPair.insert(root, 30);
        root = sumPair.insert(root, 50);
        root = sumPair.insert(root, 70);
        int sum = 70;
        sumPair.findPairWithSum(root, sum);
    }
}
