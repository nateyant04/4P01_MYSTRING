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
        if (str.length < param.length) {//when the parameter is longer
            for (int i = 0; i < str.length; i++) {
                if (str[i] < param[i]) {
                    return -1;
                } else if (str[i] > param[i]) {
                    return 1;
                }
            }
            return -1;

        } else if (str.length > param.length) {//when str is longer
            for (int i = 0; i < param.length; i++) {
                if (str[i] < param[i]) {
                    return -1;
                } else if (str[i] > param[i]) {
                    return 1;
                }
            }
            return 1;
        } else {//when same length
            for (int i = 0; i < str.length; i++) {
                if (str[i] < param[i]) {
                    return -1;
                } else if (str[i] > param[i]) {
                    return 1;
                }
            }
        }

        return 0;
    }
    //compares 2 strings lexiographically but treats all letters as lower case
    @Override
    public int compareToIgnoreCase(MyString anotherStr) {
        //creates a new MyString_Imp object that contains the lower case version of str
        char[] lowerStr;
        lowerStr = str.clone();
        for (int i = 0; i < lowerStr.length; i++) {
            lowerStr[i] = Character.toLowerCase(lowerStr[i]);
        }
        var loweredStr = new MyString_Imp(lowerStr);

        //creates a new MyString_Imp object that contains the lower case version of anotherStr
        char[] lowerParam;
        lowerParam = anotherStr.toCharArray();
        for (int i = 0; i < lowerParam.length; i++) {
            lowerParam[i] = Character.toLowerCase(lowerParam[i]);
        }
        var loweredParam = new MyString_Imp(lowerParam);
        return loweredStr.compareTo(loweredParam);

    }

    @Override
    public boolean equalsIgnoreCase(MyString anotherStr) {
        return false;
    }

    // Search methods - indexOf
    @Override
    public int indexOf(int ch) {
        for (int i =0; i <str.length; i++) {
            if (str[i] == ch){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int indexOf(int ch, int fromIndex) {
        for (int i = fromIndex; i <str.length; i++) {
            if (str[i] == ch){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int indexOf(int ch, int beginIndex, int endIndex) {
        for (int i = beginIndex; i <= endIndex; i++) {
            if (str[i] == ch){
                return i;
            }
        }
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
        int lastIndex = -1;
        for (int i =0; i <str.length; i++) {
            if (str[i] == ch){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public int lastIndexOf(int ch, int fromIndex) {
        int lastIndex = -1;
        for (int i = fromIndex; i <str.length; i++) {
            if (str[i] == ch){
                lastIndex = i;
            }
        }
        return lastIndex;
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
