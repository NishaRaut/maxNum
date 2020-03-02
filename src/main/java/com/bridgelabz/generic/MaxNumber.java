package com.bridgelabz.generic;

public class MaxNumber {
    public int getMaxNum(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
      //  System.out.println("max number is out of if>>"+max);
        if (num2.compareTo(max)>0)
            max = num2;
        if (num3.compareTo(max)>0)
            max = num3;
        return  max;
    }
}
