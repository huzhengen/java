package com.littlejava;

public class MyArray{
    int[] array = new int[10];

    public int[] add(int x){
        int index = 0;
        array[index] = x;
        index++;
        return array;
    }

    public int[] sort(){
        int temp;
        for (int i = 0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j] < array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public int max(){
        int max;
        max = array[0];
        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public int length(){
        return array.length;
    }

    public int[] output(){
        int[] newArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
}
