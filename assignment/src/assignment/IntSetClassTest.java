package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntSetClassTest {

	   @Test
	    void test() {
	        IntSetClass testObjOne = new IntSetClass(new int[] { 2, 4, 6, 8, 10 });
	        IntSetClass testObjTwo = new IntSetClass(new int[] { 1, 2, 3, 4, 5 });

	        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 8, 10 }, testObjOne.union(testObjTwo).getIntArr());
	        assertArrayEquals(new int[] { 2, 4 }, testObjOne.intersection(testObjTwo).getIntArr());
	        assertArrayEquals(new int[] { 6, 8, 10 }, testObjOne.difference(testObjTwo).getIntArr());
	        assertArrayEquals(new int[] { 1, 3, 5 }, testObjOne.complement(testObjTwo).getIntArr());
	        
	        assertEquals(true, testObjOne.isMember(2));
	        assertEquals(false, testObjOne.isMember(11));

	    }
}
