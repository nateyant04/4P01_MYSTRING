package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyString_ImpTest {

    //Character access methods
    //finished
    // Tests charAt returns the correct character at valid indices and throws IndexOutOfBoundsException at an invalid index.
    @Test
    void charAt() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals('a', myString_Imp.charAt(0));
        assertEquals('d', myString_Imp.charAt(3));
        assertEquals('g', myString_Imp.charAt(6));
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.charAt(7));
    }

    // Tests toCharArray returns a char array matching the original string for both String and char[] constructors.
    @Test
    void testToCharArray() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'}, myString_Imp.toCharArray());

        var myString_Imp2 = new MyString_Imp(new char[]{'a', 'b', 'c', 'd', ' ', 'f', 'g'});
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', ' ', 'f', 'g'}, myString_Imp2.toCharArray());
    }

    //length and emptiness checks
    //finished
    // Tests length() returns 0 for an empty string.
    @Test
    void testLengthIsZero() {
        var myString_Imp = new MyString_Imp();
        assertEquals(0, myString_Imp.length());
    }

    // Tests length() returns the correct character count for non-empty strings.
    @Test
    void testLengthGreaterThanZero() {
        var myString_Imp = new MyString_Imp("a");
        assertEquals(1, myString_Imp.length());
        var myString_Imp2 = new MyString_Imp("abcdefg");
        assertEquals(7, myString_Imp2.length());
    }

    // Tests isEmpty() returns true for an empty string and false for a non-empty string.
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
    // Tests compareTo returns 0 when both strings are identical.
    @Test
    void testCompareToSameLengthEqual() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var same = new MyString_Imp("abcdefg");
        assertEquals(0, myString_Imp.compareTo(same));
    }

    // Tests compareTo returns -1 when this string is lexicographically less than the parameter (same length).
    @Test
    void testCompareToSameLengthLess() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var greater = new MyString_Imp("abcdefh");
        assertEquals(-1, myString_Imp.compareTo(greater));
    }

    // Tests compareTo returns 1 when this string is lexicographically greater than the parameter (same length).
    @Test
    void testCompareToSameLengthGreater() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var less = new MyString_Imp("abcdeff");
        assertEquals(1, myString_Imp.compareTo(less));
    }

    // Tests compareTo returns 1 when this string is longer and shares the same prefix as the shorter parameter.
    @Test
    void testCompareToDifferentLengthShorterSame() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var shorterSame = new MyString_Imp("abcdef");
        assertEquals(1, myString_Imp.compareTo(shorterSame));
    }

    // Tests compareTo returns -1 when this string is longer but the parameter's differing character is greater.
    @Test
    void testCompareToDifferentLengthShorterGreater() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var shorterGreater = new MyString_Imp("abcdeg");
        assertEquals(-1, myString_Imp.compareTo(shorterGreater));
    }

    // Tests compareTo returns -1 when the parameter is longer and shares the same prefix as this string.
    @Test
    void testCompareToDifferentLengthLonger() {
        var myString_Imp = new MyString_Imp("abcdefg");
        var longer = new MyString_Imp("abcdefga");
        assertEquals(-1, myString_Imp.compareTo(longer));
    }

    // Tests compareToIgnoreCase returns -1 when this string is less than the parameter, ignoring case.
    @Test
    void testCompareToIgnoreCaseLess() {
        var myString_Imp = new MyString_Imp("aBcdEFg");
        var param = new MyString_Imp("AbCDefh");
        assertEquals(-1, myString_Imp.compareToIgnoreCase(param));

    }

    // Tests compareToIgnoreCase returns 1 when this string is greater than the parameter, ignoring case.
    @Test
    void testCompareToIgnoreCaseGreater() {
        var myString_Imp = new MyString_Imp("AbCdEfG");
        var param = new MyString_Imp("aBcDeFf");
        assertEquals(1, myString_Imp.compareToIgnoreCase(param));

    }

    // Search methods - indexOf
    //index of a character method tests
    // Tests indexOf(ch) returns the index of the first occurrence of a character.
    @Test
    void testIndexOf() {
        var myString_Imp = new MyString_Imp("abctefgh");
        assertEquals(7, myString_Imp.indexOf('h'));
    }

    // Tests indexOf(ch, fromIndex) returns the index of a character starting the search from the given index.
    @Test
    void testIndexOfFromIndex() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(3, myString_Imp.indexOf('d', 2));
    }

    // Tests indexOf(ch, beginIndex, endIndex) returns the index of a character within the given range.
    @Test
    void testIndexOfBeginAndEnd(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(2, myString_Imp.indexOf('c', 2, 5));
    }

    // Tests indexOf(ch) returns -1 when the character does not exist in the string.
    @Test
    void testIndexOfNotFound() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(-1, myString_Imp.indexOf('z'));
    }

    // Tests indexOf(ch, fromIndex) returns -1 when the character does not exist after the given index.
    @Test
    void testIndexOfFromIndexNotFound() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(-1, myString_Imp.indexOf('a', 1));
    }

    // Tests indexOf(ch, beginIndex, endIndex) returns -1 when the character does not exist within the given range.
    @Test
    void testIndexOfBeginAndEndNotFound() {
        var myString_Imp = new MyString_Imp("abcdefg");
        assertEquals(-1, myString_Imp.indexOf('z', 0, 6));
    }

    //lastIndex Of a character test's
    // Tests lastIndexOf(ch) returns the index of the last occurrence of a character.
    @Test
    void testLastIndexOf(){
        var myString_Imp = new MyString_Imp("aaaaaaaaaaaaa");
        assertEquals(12, myString_Imp.lastIndexOf('a'));
    }

    // Tests lastIndexOf(ch, fromIndex) returns the last occurrence of a character starting from the given index.
    @Test
    void testLastIndexOfFromIndex(){
        var myString_Imp = new MyString_Imp("aaagaaaa");
        assertEquals(3, myString_Imp.lastIndexOf('g', 3));
    }

    // Tests indexOf(str) returns the starting index of the first occurrence of the substring.
    @Test
    void testIndexOfStrExists(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("efg");
        assertEquals(4, myString_Imp.indexOf(param));
    }

    // Tests indexOf(str) returns -1 when the substring does not exist in this string.
    @Test void testIndexOfStrNotExists(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("aa");
        assertEquals(-1, myString_Imp.indexOf(param));
    }

    // Tests indexOf(str) returns -2 when the parameter string is longer than this string.
    @Test void testIndexOfStrTooLong(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("abcdefgaa");
        assertEquals(-2, myString_Imp.indexOf(param));
    }

    // Tests indexOf(str, fromIndex) skips earlier occurrences and finds the substring starting from the given index.
    @Test
    void testIndexOfStrFromIndex(){
        var myString_Imp = new MyString_Imp("abcdefgaaaefg");
        var param = new MyString_Imp("efg");
        assertEquals(10, myString_Imp.indexOf(param, 5));
    }

    // Tests indexOf(str, beginIndex, endIndex) finds the substring when it exists within the given range.
    @Test
    void testIndexOfStrFromIndexToIndexExists(){
        var myString_Imp = new MyString_Imp("aefghijk");
        var param = new MyString_Imp("efg");
        assertEquals(1, myString_Imp.indexOf(param, 0, 3));
    }

    // Tests lastIndexOf(str) returns the starting index of the last occurrence of the substring.
    @Test
    void testLastIndexOfStrExists(){
        var myString_Imp = new MyString_Imp("abcdefgefghijk");
        var param = new MyString_Imp("efg");
        assertEquals(7, myString_Imp.lastIndexOf(param));
    }

    // Tests lastIndexOf(str) returns -1 when the substring does not exist in this string.
    @Test
    void testLastIndexOfStrNotExists(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("aa");
        assertEquals(-1, myString_Imp.lastIndexOf(param));
    }


    // Pattern matching methods
    // Tests contains() returns true when the given substring exists within this string.
    @Test
    void testContainsTrue(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertTrue(myString_Imp.contains("efg"));
    }

    // Tests contains() returns false when the given substring does not exist within this string.
    @Test
    void testContainsFalse(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertFalse(myString_Imp.contains("aa"));
    }

    // Tests endsWith() returns true when this string ends with the given suffix.
    @Test
    void testEndsWithSuffixTrue(){
        var myString_Imp = new MyString_Imp("abcdefgABD");
        var mySuffix = new MyString_Imp("ABD");
        assertTrue(myString_Imp.endsWith(mySuffix));
    }

    // Tests endsWith() returns false when this string does not end with the given suffix.
    @Test
    void testEndsWithSuffixFalse(){
        var myString_Imp = new MyString_Imp("abcdefgABD");
        var mySuffix = new MyString_Imp("AB");
        assertFalse(myString_Imp.endsWith(mySuffix));
    }


    // Substring extraction methods
    // Tests substring(beginIndex) returns the correct substring starting from the given index.
    @Test
    void testSubString(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var mySub = new MyString_Imp("cdefg");
        assertEquals(0, mySub.compareTo(myString_Imp.substring(2)));
    }

    // Tests substring(beginIndex, endIndex) returns the correct substring within the given range.
    @Test
    void testSubstringEndIndex(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var mySub = new MyString_Imp("cdefg");
        assertEquals(0, mySub.compareTo(myString_Imp.substring(2, 6)));
    }

    // Tests substring(beginIndex) throws IndexOutOfBoundsException when beginIndex is negative.
    @Test
    void testSubStringNegativeBeginIndex(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.substring(-1));
    }

    // Tests substring(beginIndex) throws IndexOutOfBoundsException when beginIndex exceeds the string length.
    @Test
    void testSubStringBeginIndexTooLarge(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.substring(8));
    }

    // Tests substring(beginIndex, endIndex) throws IndexOutOfBoundsException when beginIndex is negative.
    @Test
    void testSubstringEndIndexNegativeBeginIndex(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.substring(-1, 4));
    }

    // Tests substring(beginIndex, endIndex) throws IndexOutOfBoundsException when endIndex exceeds the string length.
    @Test
    void testSubstringEndIndexTooLarge(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.substring(2, 8));
    }

    // Tests substring(beginIndex, endIndex) throws IndexOutOfBoundsException when beginIndex is greater than endIndex.
    @Test
    void testSubstringBeginGreaterThanEnd(){
        var myString_Imp = new MyString_Imp("abcdefg");
        assertThrows(IndexOutOfBoundsException.class, () -> myString_Imp.substring(4, 2));
    }

    // String modification methods
    // Tests concat() appends the given string to the end of this string and returns the combined result.
    @Test
    void testConcat(){
        var myString_Imp = new MyString_Imp("abcdefg");
        var param = new MyString_Imp("hijklmn");
        var myConcat = new MyString_Imp("abcdefghijklmn");
        assertEquals(0, myConcat.compareTo(myString_Imp.concat(param)));
    }

    // Tests strip() removes both leading and trailing whitespace.
    @Test
    void testStrip1(){
        var myString_Imp = new MyString_Imp("   abcdefg  ");
        var myStrip = new MyString_Imp("abcdefg");
        assertEquals(0, myStrip.compareTo(myString_Imp.strip()));
    }

    // Tests strip() removes only leading whitespace when there is none trailing.
    @Test
    void testStrip2(){
        var myString_Imp = new MyString_Imp("   abcdefg");
        var myStrip = new MyString_Imp("abcdefg");
        assertEquals(0, myStrip.compareTo(myString_Imp.strip()));
    }

    // Tests strip() removes only trailing whitespace when there is none leading.
    @Test
    void testStrip3(){
        var myString_Imp = new MyString_Imp("abcdefg  ");
        var myStrip = new MyString_Imp("abcdefg");
        assertEquals(0, myStrip.compareTo(myString_Imp.strip()));
    }

    // Tests strip() preserves whitespace in the middle of the string.
    @Test
    void testStrip4(){
        var myString_Imp = new MyString_Imp("abc defg");
        var myStrip = new MyString_Imp("abc defg");
        assertEquals(0, myStrip.compareTo(myString_Imp.strip()));
    }


    // Trim tests
    // Tests trim() removes both leading and trailing spaces.
    @Test
    void testTrim1(){
        var myString_Imp = new MyString_Imp("   abcdefg   ");
        var myTrim = new MyString_Imp("abcdefg");
        assertEquals(0, myTrim.compareTo(myString_Imp.trim()));
    }

    // Tests trim() removes only leading spaces when there are none trailing.
    @Test
    void testTrim2(){
        var myString_Imp = new MyString_Imp("   abcdefg");
        var myTrim = new MyString_Imp("abcdefg");
        assertEquals(0, myTrim.compareTo(myString_Imp.trim()));
    }

    // Tests trim() removes only trailing spaces when there are none leading.
    @Test
    void testTrim3(){
        var myString_Imp = new MyString_Imp("abcdefg   ");
        var myTrim = new MyString_Imp("abcdefg");
        assertEquals(0, myTrim.compareTo(myString_Imp.trim()));
    }

    // Tests trim() preserves spaces in the middle of the string.
    @Test
    void testTrim4(){
        var myString_Imp = new MyString_Imp("abc defg");
        var myTrim = new MyString_Imp("abc defg");
        assertEquals(0, myTrim.compareTo(myString_Imp.trim()));
    }

    // Tests trim() returns an empty string when the input contains only spaces.
    @Test
    void testTrim5(){
        var myString_Imp = new MyString_Imp("     ");
        var myTrim = new MyString_Imp("");
        assertEquals(0, myTrim.compareTo(myString_Imp.trim()));
    }

    // Tests trim() removes characters with codepoint <= U+0020, such as tab, from both ends.
    @Test
    void testTrim6(){
        var myString_Imp = new MyString_Imp("\tabcdefg\t");
        var myTrim = new MyString_Imp("abcdefg");
        assertEquals(0, myTrim.compareTo(myString_Imp.trim()));
    }

    // Conversion methods

}
