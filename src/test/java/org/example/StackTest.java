package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;


    @BeforeEach
    public void setUp(){
        stack = new Stack(5);
    }

    @Test
    public void putItemInStack(){
        stack.push("Bob");
        assertEquals("Bob", stack.peek());
    }

    @Test
    public void putMultipleItemsInStack(){
        stack.push("Bob");
        stack.push("Bib");
        stack.push("Bab");
        assertEquals("Bab", stack.peek());
    }

    @Test
    public void removeItemFromStack(){
        stack.push("Bob");
        stack.push("Bib");
        stack.push("Bab");
        stack.pop();
        assertEquals("Bib", stack.peek());
    }

}