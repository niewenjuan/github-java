package com.service.cseuiprojectn86813.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseuiprojectn86813 {

        Cseuiprojectn86813Delegate cseuiprojectn86813Delegate = new Cseuiprojectn86813Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseuiprojectn86813Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}