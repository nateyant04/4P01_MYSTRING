package org.example;

public class MyString_Imp implements MyString{
    private char[] str;

    public MyString_Imp() {
        //initializes a newly created String object so that it represents
        //and empty character sequence
        this.str = new char [0];
    }

    public MyString_Imp(char[] str) {
        //allocates a new String so that it represents the sequence of characters currently
        //contained in the character array argument.
        this.str = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            this.str[i] = str[i];
        }
    }

    public MyString_Imp(char[] value, int offset, int count) {
        //allocates a new string that contains characters from a subarray
        //of the character array argument.
        this.str = new char[count];
    }

    public MyString_Imp(String orignal) {
        //initalizes a newly created String object so that it represents the
        //same sequence of characters as the argument;
        //in other words, the newly created stirng is a copy of the argument string
        this.str = orignal.toCharArray();
    }


    // Character access methods
    @Override
    public char charAt(int index) {
        return str[index];
    }

    @Override
    public char[] toCharArray() {
        char[] result = str.clone();
        return result;
    }

    // Length and emptiness checks
    @Override
    public int length() {
        return str.length;
    }

    @Override
    public boolean isEmpty() {
        if (str.length == 0) {
            return true;
        }
        return false;
    }

    // Comparison methods
    @Override
    //compares 2 strings lexicographically
    public int compareTo(MyString anotherStr) {//need to fix this
        char[] param = anotherStr.toCharArray();
        for (int i = 0; i < Math.min(str.length, param.length); i++) {
            if (str[i] < param[i]) {
                return -1;
            } else if (str[i] > param[i]) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int compareToIgnoreCase(MyString str) {
        return 0;
    }

    @Override
    public boolean equalsIgnoreCase(MyString anotherStr) {
        return false;
    }

    // Search methods - indexOf
    @Override
    public int indexOf(int ch) {
        return 0;
    }

    @Override
    public int indexOf(int ch, int fromIndex) {
        return 0;
    }

    @Override
    public int indexOf(int ch, int beginIndex, int endIndex) {
        return 0;
    }

    @Override
    public int indexOf(MyString str) {
        return 0;
    }

    @Override
    public int indexOf(MyString str, int fromIndex) {
        return 0;
    }

    @Override
    public int indexOf(MyString str, int beginIndex, int endIndex) {
        return 0;
    }

    // Search methods - lastIndexOf
    @Override
    public int lastIndexOf(int ch) {
        return 0;
    }

    @Override
    public int lastIndexOf(int ch, int fromIndex) {
        return 0;
    }

    @Override
    public int lastIndexOf(MyString str) {
        return 0;
    }

    // Pattern matching methods
    @Override
    public boolean contains(CharSequence s) {
        return false;
    }

    @Override
    public boolean endsWith(MyString suffix) {
        return false;
    }

    // Substring extraction methods
    @Override
    public MyString substring(int beginIndex) {
        return null;
    }

    @Override
    public MyString substring(int beginIndex, int endIndex) {
        return null;
    }

    // String modification methods
    @Override
    public MyString concat(MyString str) {
        return null;
    }

    @Override
    public MyString strip() {
        return null;
    }

    @Override
    public MyString trim() {
        return null;
    }

    // Conversion methods
}
