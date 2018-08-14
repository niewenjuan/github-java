package com.service.cseuiprojectn27097.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseuiprojectn27097 {

        Cseuiprojectn27097Delegate cseuiprojectn27097Delegate = new Cseuiprojectn27097Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseuiprojectn27097Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}