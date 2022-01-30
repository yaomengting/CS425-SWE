package org.example.question1;

import java.util.Arrays;

public class ArrayFlattener {

    public int[] flattenArray(int[][] array){
        if(array == null)return null;
        int[] flatArray = Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
        return flatArray;
    }

}
