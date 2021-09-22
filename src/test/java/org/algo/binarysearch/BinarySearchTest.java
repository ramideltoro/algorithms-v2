package org.algo.binarysearch;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void search() {
        int[] array = new int[]{1,2,3,4,10,20,30};
        int index = binarySearch.search(array,10);
        int indexI = binarySearch.searchI(array,10);

        System.out.println("index="+index);
        System.out.println("indexI="+indexI);

    }
}