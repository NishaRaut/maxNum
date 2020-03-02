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
        int result=maxNumber.getMaxNum(6,15,7);
        Assert.assertEquals(15,result);

    }
}
