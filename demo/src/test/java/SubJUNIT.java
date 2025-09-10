package test.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.java.com.Sub;

import java.beans.Transient;
public class SubJUNIT {
    @Test
    public void testSub(){
        Sub calc = new Sub();
        assertEquals(1, calc.sub(3, 2));
    }
}
