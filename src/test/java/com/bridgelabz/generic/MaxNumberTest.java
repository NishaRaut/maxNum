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
        float result=maxNumber.getMaxNum(3.5f,2.5f,1.5f);
        Assert.assertEquals(3.5f,result,0.0);

    }

}
