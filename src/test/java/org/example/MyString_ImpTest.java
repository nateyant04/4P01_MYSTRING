package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyString_ImpTest {

    @Test
    void test() {
        var myString_Imp = new MyString_Imp();
        assertEquals(0, myString_Imp.charAt(0));
    }


}