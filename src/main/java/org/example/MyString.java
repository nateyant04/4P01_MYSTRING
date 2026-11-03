package org.example;

public interface MyString {
    // Character access methods
    char charAt(int index);
    char[] toCharArray();

    // Length and emptiness checks
    int length();
    boolean isEmpty();

    // Comparison methods
    int compareTo(MyString anotherStr);
    int compareToIgnoreCase(MyString str);
    boolean equals(Object anObject);
    boolean equalsIgnoreCase(MyString anotherStr);

    // Search methods - indexOf
    int indexOf(int ch);
    int indexOf(int ch, int fromIndex);
    int indexOf(int ch, int beginIndex, int endIndex);
    int indexOf(MyString str);
    int indexOf(MyString str, int fromIndex);
    int indexOf(MyString str, int beginIndex, int endIndex);

    // Search methods - lastIndexOf
    int lastIndexOf(int ch);
    int lastIndexOf(int ch, int fromIndex);
    int lastIndexOf(MyString str);

    // Pattern matching methods
    boolean contains(CharSequence s);
    boolean endsWith(MyString suffix);

    // Substring extraction methods
    MyString substring(int beginIndex);
    MyString substring(int beginIndex, int endIndex);

    // String modification methods
    MyString concat(MyString str);
    MyString strip();
    MyString trim();

    // Conversion methods
    String toString();

}
