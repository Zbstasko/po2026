package agh.po.lab3;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

import java.util.Map;

public class CodingBatTest {
    CodingBat c = new CodingBat();

    @org.junit.Test
    public void array123() {
        assertEquals(true, c.array123(new int[]{1, 2, 3}));
        assertEquals(true, c.array123(new int[]{1, 2, 2, 2, 2, 3, 3, 3, 1, 2, 3, 3, 3, 4}));
        assertEquals(false, c.array123(new int[]{1, 2, 1, 2, 1, 3, 3, 2, 2, 3}));
        assertEquals(false, c.array123(new int[]{1, 1, 3, 2, 3, 2, 3, 2, 1}));
        assertEquals(false, c.array123(new int[]{1, 23, 3}));
    }

    @Test
    public void lucky13() {
        assertEquals(false, c.lucky13(new int[]{1, 2, 3}));
        assertEquals(true, c.lucky13(new int[]{0, 2, 4}));
        assertEquals(true, c.lucky13(new int[]{60, 2, 4}));
        assertEquals(true, c.lucky13(new int[]{2, 4, 6, 8}));
    }
    @Test
    public void mapAB4() {
        assertEquals(Map.of("a", "aaa", "b", "bb", "c", "aaa"), c.mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
        assertEquals(Map.of("a","aa", "b","bbb", "c","bbb"),c.mapAB4(new HashMap<>(Map.of("a","aa", "b","bbb", "c","cake"))));
        assertEquals(Map.of("a","aa", "b","bbb", "c","bbb"),c.mapAB4(new HashMap<>(Map.of("a","aa", "b","bbb"))));
    }
}