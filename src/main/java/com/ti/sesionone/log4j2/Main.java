package com.ti.sesionone.log4j2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    //private static Logger log = LogManager.getLogManager(Main.class.getName());
    private static Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.info("this in an info log");
        log.error("This is an error log");
    }
}
