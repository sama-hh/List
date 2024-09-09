package org.example;

import java.util.Arrays;

public class Sack {
    private int[] arr;
    private int size;

    public Sack() {
        this.arr = new int[10];
        size = 0;
    }

    public void add(int element) {
        arr[size++] = element;
        if (size == arr.length) {
            doubleSize();
        }
    }

    public void doubleSize() {
        int[] newArr = new int[size * 2];
        for(int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        return arr[index];
    }

    public int size() {
        return size;
    }

    public void removeLastElement() {
        int[] newArr = new int[arr.length - 1];

        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        size--;
        arr = newArr;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
