package org.example.question1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTestNull {

    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public void flattenArray() {
        int[][] array = null;
        int[] computedArr = arrayFlattener.flattenArray(array);
        int[] expectedArr = null;
        assertArrayEquals(computedArr, expectedArr);
    }
}