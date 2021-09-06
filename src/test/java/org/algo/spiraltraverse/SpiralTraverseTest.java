package org.algo.spiraltraverse;

import org.junit.jupiter.api.Test;

class SpiralTraverseTest {

    private SpiralTraverse spiralTraverse = new SpiralTraverse();

    @Test
    void traverse() {
        int[][] array = new int[][]{
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
        };

        spiralTraverse.spiralTraverse(array)
                .forEach(System.out::println);
    }
}