package com.bridgelabz.generic;

public class MaxNumber {
    public String getMaxValue(String value1, String value2, String value3) {
        String max = value1;
        if (value2.compareTo(max)>0)
            max = value2;
        if (value3.compareTo(max)>0)
            max = value3;
        return  max;
    }
}
