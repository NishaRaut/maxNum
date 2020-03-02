package com.bridgelabz.generic;

public class MaxNumber {
    public static <T extends Comparable<T>> T getMaxValue(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max)>0)
            max = value2;
        if (value3.compareTo(max)>0)
            max = value3;
        return  max;
    }
}
