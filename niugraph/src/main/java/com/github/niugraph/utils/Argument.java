package com.github.niugraph.utils;


public class Argument {

    public static void assertNotNull(Object argument, String message) {
        if( argument == null )
            throw new IllegalArgumentException("argument can not be null: " + message);
    }

}
