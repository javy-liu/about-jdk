package org.oyach.designpattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class Singleton1Test {

    @Test
    public void testGetInstane() throws Exception {
        Singleton1.getInstance();
    }

    @Test
    public void testCreate() throws Exception {
        Singleton1.create();
    }
}