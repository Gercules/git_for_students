package com.vsuet.uits.algo.sortings;

public class Bubble {
    public static void sort(int[] array){
        int vrem = 0;
        int lenarray = array.length;
        for (int fn=0; fn < lenarray ; fn++){
            for (int fs=0; fs < lenarray - 1; fs++){
                if (array[fs]>array[fs+1]){
                    vrem = array[fs];
                    array[fs] = array[fs+1];
                    array[fs+1] = vrem;
                }


            }
        }
    }
}
