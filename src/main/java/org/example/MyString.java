package org.example;

public interface MyString {
    char charAt(int index);
    int compareTo(MyString anotherStr);
    int compareToIgnoreCase(MyString str);
    MyString concat(MyString str);
    boolean contains(CharSequence s);
    boolean endsWith(MyString suffix);
    boolean equals(Object anObject);
    boolean equalsIgnoreCase(MyString anotherStr);
    int indexOf(int ch);
    int indexOf(int ch, int fromIndex);
    int indexOf(int ch, int beginIndex, int endIndex);
    int indexOf(MyString str);
    int indexOf(MyString str, int fromIndex);
    int indexOf(MyString str, int beginIndex, int endIndex);
    boolean isEmpty();
    int lastIndexOf(int ch);
    int lastIndexOf(int ch, int fromIndex);
    int lastIndexOf(MyString str);
    int length();
    String toString();
    MyString strip();
    MyString substring(int beginIndex);
    MyString substring(int beginIndex, int endIndex);
    char[] toCharArray();
    MyString trim();

}
