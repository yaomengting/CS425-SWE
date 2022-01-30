package org.example.question2;

import org.example.question2.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayReversor arrayReversor;
   private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);

    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;

    }

    @Test
    public void reverseArray() {
        int[][] a_in = new int[][]{{1,3}, {0}, {4,5,9}};
        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] actual = arrayReversor.reverseArray(a_in);
        int[] expected = new int[]{9,5,4,0,3,1};
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(a_in);
    }
}