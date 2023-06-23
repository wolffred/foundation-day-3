package org.example;

public class Stack {
    private String[] words;
    private int element = -1;
    private int maximum;

    public Stack(int maximum) {
        this.maximum = maximum;
        words = new String[maximum];
    }

    public void push(String item) {
        element += 1;
        words[element] = item;
    }
    //if element exceeds maximum?

    public String pop() {
        element -= 1;
        return words[element];
    }
    //Nothing in array?

    public String peek() {
        return words[element];
    }
    
    public void all(){
        for (String word : words) {
            System.out.println(word);
        }
    }

}
