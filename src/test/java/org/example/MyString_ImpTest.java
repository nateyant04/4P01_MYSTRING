package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyString_ImpTest {

    //Character access methods
    @Test
    void charAt() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals('a', myString_Imp.charAt(0));
        assertEquals('d', myString_Imp.charAt(3));
        assertEquals('g', myString_Imp.charAt(6));
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.charAt(7));
    }
    @Test
    void testToCharArray() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'}, myString_Imp.toCharArray());

        var myString_Imp2 = new MyString_Imp(new char[]{'a', 'b', 'c', 'd', ' ', 'f', 'g'});
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', ' ', 'f', 'g'}, myString_Imp2.toCharArray());
    }

    //length and emptiness checks
    @Test
    void testLengthIsZero() {
        var myString_Imp = new MyString_Imp();
        assertEquals(0, myString_Imp.length());
    }
    @Test
    void testLengthGreaterThanZero() {
        var myString_Imp = new MyString_Imp("a");
        assertEquals(1, myString_Imp.length());
        var myString_Imp2 = new MyString_Imp("abcdefg");
        assertEquals(7, myString_Imp2.length());
    }

    @Test
    void testIsEmpty() {
        var myString_Imp = new MyString_Imp();
        assertTrue(myString_Imp.isEmpty());
        var myString_Imp2 = new MyString_Imp("a");
        assertFalse(myString_Imp2.isEmpty());
    }

    // Comparison methods
    @Test
    void testCompareToSameLength() {
        //taking cases into consideration. myString_Imp < parameter = -1, equal = 0, myString_imp > paramter = 1
        var myString_Imp = new MyString_Imp("abcdefg");
        var same = new MyString_Imp("abcdefg");
        var greater = new MyString_Imp("abcdefh");
        var less = new MyString_Imp("abcdeff");
        assertEquals(0, myString_Imp.compareTo(same));
        assertEquals(-1, myString_Imp.compareTo(greater));
        assertEquals(1, myString_Imp.compareTo(less));
    }
    @Test
    void testCompareToDifferentLength() {//takes cases into consideration.
        var myString_Imp = new MyString_Imp("abcdefg");
        var shorterSame = new MyString_Imp("abcdef");
        var shorterGreater = new MyString_Imp("abcdeg");
        var longer = new MyString_Imp("abcdefga");
        assertEquals(1, myString_Imp.compareTo(shorterSame));
        assertEquals(-1, myString_Imp.compareTo(shorterGreater));
        assertEquals(-1, myString_Imp.compareTo(longer));
    }

    @Test
    void testCompareToIgnoreCase() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var same = new MyString_Imp("ABCDEFG");
        assertEquals(0, myString_Imp.compareToIgnoreCase(same));
        var different = new MyString_Imp("abcdefh");
        assertEquals(-1, myString_Imp.compareToIgnoreCase(different));

    }


    // Search methods - indexOf


    // Search methods - lastIndexOf

    // Pattern matching methods

    // Substring extraction methods

    // String modification methods

    // Conversion methods

}