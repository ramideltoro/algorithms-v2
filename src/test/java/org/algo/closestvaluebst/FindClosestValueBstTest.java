package org.algo.closestvaluebst;

import org.algo.binarytreeimpl.BinaryTree;
import org.junit.jupiter.api.Test;

class FindClosestValueBstTest {

    private final FindClosestValueBst findClosestValueBst = new FindClosestValueBst();

    @Test
    void findClosestValueInBST() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(1);
        binaryTree.add(10);
        binaryTree.add(20);
        binaryTree.add(30);
        binaryTree.add(40);
        binaryTree.add(50);
        binaryTree.add(12);

        int target = 15;

        int closest = findClosestValueBst.findClosestValueInBST(binaryTree,target);
        int closestIteratively = findClosestValueBst.findClosestValueInBSTIteratively(binaryTree,target);

       System.out.println("closest = "+closest);
       System.out.println("closestIteratively = "+closestIteratively);

    }
}