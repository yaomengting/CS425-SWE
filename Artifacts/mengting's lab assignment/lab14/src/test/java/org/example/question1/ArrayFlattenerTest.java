package org.example.question1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {
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
        int[][] array = {{1,3},{0},{4,5,9}};
        int[] computedArr = arrayFlattener.flattenArray(array);
        int[] expectedArr = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(computedArr, expectedArr);
    }
}