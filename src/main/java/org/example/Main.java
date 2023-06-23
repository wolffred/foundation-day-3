package org.example;

public class Main {
    public static void main(String[] args) {


//        int stackarray[] = new int[10];
//
//        int top = -1;
//
//        System.out.println(stackarray[top]);

        Stack stack = new Stack(3);

        stack.push("Bob");
        stack.push("Bib");
        stack.push("Bab");
        stack.all();

        System.out.println(stack.peek());
    }
}