package org.oyach.designpattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class Singleton2Test {

    @Test
    public void testGetInstance() throws Exception {
        Singleton2.getInstance();
    }

    @Test
    public void testCreate() throws Exception {
        Singleton2.create();
    }




}