package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestGithubjava {

        GithubjavaDelegate githubjavaDelegate = new GithubjavaDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = githubjavaDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}