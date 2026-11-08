package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyString_ImpTest {

    //Character access methods
    //finished
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
    //finished
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
    //taking cases into consideration. myString_Imp < parameter = -1, equal = 0, myString_imp > paramter = 1
    //finished
    @Test
    void testCompareToSameLengthEqual() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var same = new MyString_Imp("abcdefg");
        assertEquals(0, myString_Imp.compareTo(same));
    }
    @Test
    void testCompareToSameLengthLess() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var greater = new MyString_Imp("abcdefh");
        assertEquals(-1, myString_Imp.compareTo(greater));
    }
    @Test
    void testCompareToSameLengthGreater() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var less = new MyString_Imp("abcdeff");
        assertEquals(1, myString_Imp.compareTo(less));
    }
    @Test
    void testCompareToDifferentLengthShorterSame() {//takes cases into consideration.
        var myString_Imp = new MyString_Imp("abcdefg");
        var shorterSame = new MyString_Imp("abcdef");
        assertEquals(1, myString_Imp.compareTo(shorterSame));
    }
    @Test
    void testCompareToDifferentLengthShorterGreater() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var shorterGreater = new MyString_Imp("abcdeg");
        assertEquals(-1, myString_Imp.compareTo(shorterGreater));
    }
    @Test
    void testCompareToDifferentLengthLonger() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var longer = new MyString_Imp("abcdefga");
        assertEquals(-1, myString_Imp.compareTo(longer));
    }

    @Test
    void testCompareToIgnoreCaseLess() {
        var myString_Imp = new MyString_Imp("aBcdEFg");
        var param = new MyString_Imp("AbCDefh");
        assertEquals(-1, myString_Imp.compareToIgnoreCase(param));

    }
    @Test
    void testCompareToIgnoreCaseGreater() {
        var myString_Imp = new MyString_Imp("AbCdEfG");
        var param = new MyString_Imp("aBcDeFf");
        assertEquals(1, myString_Imp.compareToIgnoreCase(param));

    }

    // Search methods - indexOf
    //index of a character method tests
    @Test
    void testIndexOf() {//indexOf(ch)
        var myString_Imp = new MyString_Imp("abctefgh");
        assertEquals(7, myString_Imp.indexOf('h'));
    }
    @Test
    void testIndexOfFromIndex() {//indexOf(ch, fromIndex)
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(3, myString_Imp.indexOf('d', 2));
    }

    @Test
    void testIndexOfBeginAndEnd(){//indexOf(ch, beginIndex, endIndex
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(2, myString_Imp.indexOf('c', 2, 5));
    }

    //lastIndex Of a character test's
    @Test
    void testLastIndexOf(){//lastIndexOf(ch)
        var myString_Imp = new MyString_Imp("aaaaaaaaaaaaa");
        assertEquals(12, myString_Imp.lastIndexOf('a'));
    }

    @Test
    void testLastIndexOfFromIndex(){//lastIndexOf(ch, fromIndex)
        var myString_Imp = new MyString_Imp("aaagaaaa");
        assertEquals(3, myString_Imp.lastIndexOf('g', 3));
    }

    @Test
    void testIndexOfStrExists(){//IndexOf(str)
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("efg");
        assertEquals(4, myString_Imp.indexOf(param));
    }
    @Test void testIndexOfStrNotExists(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("aa");
        assertEquals(-1, myString_Imp.indexOf(param));
    }
    @Test void testIndexOfStrTooLong(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("abcdefgaa");
        assertEquals(-2, myString_Imp.indexOf(param));
    }

    @Test
    void testIndexOfStrFromIndex(){
        var myString_Imp = new MyString_Imp("abcdefgaaaefg");
        var param = new MyString_Imp("efg");
        assertEquals(10, myString_Imp.indexOf(param, 5));
    }

    @Test
    void testIndexOfStrFromIndexToIndexExists(){
        var myString_Imp = new MyString_Imp("aefghijk");
        var param = new MyString_Imp("efg");
        assertEquals(1, myString_Imp.indexOf(param, 0, 3));
    }



    // Pattern matching methods

    // Substring extraction methods

    // String modification methods

    // Conversion methods

}