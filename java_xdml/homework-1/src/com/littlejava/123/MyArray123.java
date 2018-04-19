package com.littlejava;

import java.util.Arrays;

//https://github.com/chenpengqi/homework-1

public class MyArray123 {
    int[] arr = new int[0];// 数组arr，长度0
    int mid;
    public int[] add(int x){
        int[] temparr = new int[arr.length+1];// 一个新数组temparr，比arr的长度+1
        System.arraycopy(arr,0,temparr,0,arr.length);// 复制数组
        temparr[arr.length] = x;//temparr数组的最后一位传入x
        arr = temparr;
        return   arr;
    }
    public int[] sort(){
        for ( int i=0; i < arr.length; i++ ){

            for ( int j=0; j < arr.length-1-i; j++ ){
                if(arr[j]>arr[j+1]){
                    mid = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = mid;
                }

            }
        }
        return arr;
    }
    public int max(){
        int max = arr[0];
        for ( int i=1; i < arr.length; i++ ){

            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int length(){
        return arr.length;
    }
    public int[] output(){

        int[] outarr = new int[arr.length];
        System.arraycopy(arr,0,outarr,0,arr.length);

        return   outarr;
    }
}