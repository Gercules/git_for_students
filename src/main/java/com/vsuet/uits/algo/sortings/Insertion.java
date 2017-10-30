package com.vsuet.uits.algo.sortings;

public class Insertion {
    public static void sort(int[] array){
        int vrem = 0;
        int lenarray = array.length;
        for (int fn = 0; fn < lenarray; fn++){
            for (int fs = 0; fs < lenarray; fs++){
                if (array[fs] < array[fn]){
                    vrem = array[fn];
                    array[fn] = array[fs];
                    array[fs]=vrem;
                }
            }
        }
    }
}
