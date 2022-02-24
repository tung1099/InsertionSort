package com.company;

public class InsertionSort {
    static int[] list = {35,-9,5,7,3,22,-11,10,2};

    public static void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ // list[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }
    public static void main(String[] args) {
	// write your code here
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
