package com.kot.strategy.textStrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextContextTest {

    @Test
    void lower() {
        //given
        String text = "Abcd";
        TextContext textContext = new TextContext();

        //when
        String modify = textContext.modify(text, TextModification.LOWER);

        //then
        assertEquals("abcd", modify);
    }


    @Test
    void upper() {
        //given
        String text = "Abcd";
        TextContext textContext = new TextContext();

        //when
        String modify = textContext.modify(text, TextModification.UPPER);

        //then
        assertEquals("ABCD", modify);
    }
}