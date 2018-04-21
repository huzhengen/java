package com.company;

public class Main {

    // static
    public static void main(String[] args) {
	    // write your code here
        MyArray myArray = new MyArray();
        myArray.add(10);
        myArray.add(1);

        int max = myArray.max();

        int x = myArray.x;

        MyArray.class_method();

        MyArray myArray1 = new MyArray(123);
    }
}
