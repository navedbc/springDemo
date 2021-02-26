package com.in2min.springapp.springsort;

public class BinarySearchImpl {

    SortInterface sortInterface;

    public BinarySearchImpl(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }

    public void search(int[] ints, int i) {

        //sort the array
        sortInterface.sort(new int[] {10,23,45,67,8});
        //find the index
    }
}
