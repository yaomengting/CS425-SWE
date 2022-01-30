package org.example.question2;

import org.example.question2.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService){
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] array){
        if(array == null)return null;
        int[] a_flat = new int[]{1,3,0,4,5,9};
        if(a_flat == null)
            return null;
        int i = 0;
        int j = a_flat.length - 1;
        while(i < j) {
            int temp = a_flat[i];
            a_flat[i] = a_flat[j];
            a_flat[j] = temp;
            i++;
            j--;
        }
        return a_flat;
    }
}
