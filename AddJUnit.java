package com.tp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
    @Test
    public void testAdd() {
        Add calc = new Add();
        assertEquals(5, calc.add(2, 3));
    }
}