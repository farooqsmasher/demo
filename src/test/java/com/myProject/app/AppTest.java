package com.myProject.app;

import junit.framework.Assert;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test

    public void StringTest() {
        
        Hello tst = new Hello();
        Assert.assertEquals(36,tst.test().length());
    }
}
