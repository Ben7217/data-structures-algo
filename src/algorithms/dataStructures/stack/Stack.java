package algorithms.dataStructures.stack;

import java.util.Arrays;

public class Stack {

    private int maxSize; // store size of the stack
    private char[] stackArray; // container for list of items.
    private int top; // represents index position of last item placed on top of the stack


    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;  // first item will be at the zeroth index of the array
    }

    public void push(char j) {
        if(isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack is already empty!");
            return '0';
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "maxSize=" + maxSize +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", top=" + top +
                '}';
    }
}
