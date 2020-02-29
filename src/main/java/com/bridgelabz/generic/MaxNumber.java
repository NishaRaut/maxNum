package com.bridgelabz.generic;

public class MaxNumber {

    public int getMaxNum(int i, int i1, int i2) {
        int max = 0;
        if (i >= i1 && i >= i2)
            max = i;
        else if (i1 >= i && i1 >= i2)
            max=i1 ;
        else
            max=i2 ;
        System.out.println("max number is>>"+max);
    return max;
    }
}
