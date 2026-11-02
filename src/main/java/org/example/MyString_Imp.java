package org.example;

public class MyString_Imp implements MyString{
    private char[] str;
    public MyString_Imp() {
        this.str = new char [0];
    }

    public MyString_Imp(char[] str) {
    }

    public MyString_Imp(char[] value, int offset, int count) {
        this.str = new char[count];
    }

    public MyString_Imp(String str) {
        this.str = str.toCharArray();
    }



    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public int compareTo(MyString anotherStr) {
        return 0;
    }

    @Override
    public int compareToIgnoreCase(MyString str) {
        return 0;
    }

    @Override
    public MyString concat(MyString str) {
        return null;
    }

    @Override
    public boolean contains(CharSequence s) {
        return false;
    }

    @Override
    public boolean endsWith(MyString suffix) {
        return false;
    }

    @Override
    public boolean equalsIgnoreCase(MyString anotherStr) {
        return false;
    }

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

    @Override
    public boolean isEmpty() {
        return false;
    }

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

    @Override
    public int length() {
        return 0;
    }

    @Override
    public MyString strip() {
        return null;
    }

    @Override
    public MyString substring(int beginIndex) {
        return null;
    }

    @Override
    public MyString substring(int beginIndex, int endIndex) {
        return null;
    }

    @Override
    public char[] toCharArray() {
        return new char[0];
    }

    @Override
    public MyString trim() {
        return null;
    }
}
