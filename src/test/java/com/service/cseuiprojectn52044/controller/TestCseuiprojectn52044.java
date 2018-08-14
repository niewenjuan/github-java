package com.service.cseuiprojectn52044.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCseuiprojectn52044 {

        Cseuiprojectn52044Delegate cseuiprojectn52044Delegate = new Cseuiprojectn52044Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cseuiprojectn52044Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}