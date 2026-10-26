package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
CodingBat c = new CodingBat();
@org.junit.Test
    public  void array123(){
    assertEquals(true,c.array123(new int[]{1,2,3}));
    assertEquals(true,c.array123(new int[]{1,2,2,2,2,3,3,3,1,2,3,3,3,4}));
    assertEquals(false,c.array123(new int[]{1,2,1,2,1,3,3,2,2,3}));
    assertEquals(false,c.array123(new int[]{1,1,3,2,3,2,3,2,1}));
    assertEquals(false,c.array123(new int[]{1,23,3}));
    }

    @Test
    public void lucky13() {
        assertEquals(false,c.lucky13(new int[]{1,2,3}));
        assertEquals(true,c.lucky13(new int[]{0,2,4}));
        assertEquals(true,c.lucky13(new int[]{60,2,4}));
        assertEquals(true,c.lucky13(new int[]{2,4,6,8}));
    }
}