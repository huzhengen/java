package com.company;

public class MyArray {
    private int[] array;
    private int len;

    private static int count = 0;

    public int x = 0;

    public static int class_method(){
        count++;
        return count;
    }

    public MyArray(){
        array = new int[100];
        len = 0;
    }

    private int inner(){
        return len;
    }

    //构造方法，初始化方法，方法名字和类的名字一样，没有返回类型
    public MyArray(int length){
        array = new int[length];
        len = 0;// 当前长度为0
    }

    public void add(int x){
        array[len] = x;
        len++;
    }

    public int max(){
        int max = array[0];
        for (int i=0; i<len; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
