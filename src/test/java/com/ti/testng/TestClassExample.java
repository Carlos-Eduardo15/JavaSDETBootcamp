package com.ti.testng;

import org.testng.annotations.Test;

@Test
public class TestClassExample {
    public void testA(){//funciona
        System.out.println("Test A");
    }

    private void testB(){//no funciona
        System.out.println("Test B");
    }

    protected void testC(){//no funciona
        System.out.println("Test C");
    }
}
