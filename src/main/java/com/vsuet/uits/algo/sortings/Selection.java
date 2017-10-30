package com.vsuet.uits.algo.sortings;

public class Selection {
    public static void sort(int[] array){
        int lenarray = array.length;
        int minimum = 0;
        int vrem = 0;
        for (int fn=0; fn < lenarray - 1; fn++){
           minimum = fn;
           for (int sn=fn+1; sn < lenarray; sn++){
               if(array[sn]<array[minimum]){
                   minimum = sn;
               }
           }
            vrem = array[minimum];
            array[minimum] = array[fn];
            array[fn]=vrem;
        }
    }

}
