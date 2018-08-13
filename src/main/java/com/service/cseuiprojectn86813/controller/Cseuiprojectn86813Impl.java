package com.service.cseuiprojectn86813.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-13T07:44:03.933Z")

@RestSchema(schemaId = "cseuiprojectn86813")
@RequestMapping(path = "/CSE-UI-PROJECT-N86813", produces = MediaType.APPLICATION_JSON)
public class Cseuiprojectn86813Impl {

    @Autowired
    private Cseuiprojectn86813Delegate userCseuiprojectn86813Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseuiprojectn86813Delegate.helloworld(name);
    }

}
