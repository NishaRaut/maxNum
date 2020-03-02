package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxNumberTest {
    MaxNumber maxNumber;

    @Before
    public void setUp() throws Exception {
        maxNumber=new MaxNumber();
    }

    @Test
    public void givenThreeNumbers_shoubldBeReturnMaxNum() {
        String result=maxNumber.getMaxValue("Apple","Banana","Peach");
        Assert.assertEquals("Peach",result);
    }

}
