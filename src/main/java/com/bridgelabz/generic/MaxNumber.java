package com.bridgelabz.generic;

public class MaxNumber {
    public float getMaxNum(Float num1, Float num2, Float num3) {
        float max = num1;
        if (num2.compareTo(max)>0)
            max = num2;
        if (num3.compareTo(max)>0)
            max = num3;
        return  max;
    }
}
