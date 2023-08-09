package com.ti.testng;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {
    @BeforeGroups
    void beforeGroups(){
        System.out.println();
    }

    @Test(groups = "backlog")
    void testBackLogA(){
        System.out.println("Testing item A in the backlog");
    }

}
