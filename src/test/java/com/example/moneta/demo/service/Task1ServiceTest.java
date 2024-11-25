package com.example.moneta.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1ServiceTest {
    private final Task1Service task1Service = new Task1Service();

    @Test
    public void testTransformString_normalInput() {
        String input = "Ahoj, jak se máš?";
        String expected = "?šÁm es kaj ,jOha";
        String result = task1Service.transformString(input);
        assertEquals(expected, result);
    }

    @Test
    public void testTransformString_multipleSpaces() {
        String input = "Je     mi   fajn.";
        String expected = ".NjaF iM ej";
        String result = task1Service.transformString(input);
        assertEquals(expected, result);
    }
}
