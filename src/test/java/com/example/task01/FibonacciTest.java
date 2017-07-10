package com.example.task01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-07-10.
 */
public class FibonacciTest {

    @Test
    public void testFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int test = fibonacci.fibonacci(6);
        int results = 8;

        Assert.assertEquals(results,test);

    }
    



}