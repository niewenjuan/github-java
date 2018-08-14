package com.service.cseuiprojectn52044.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-14T01:50:58.385Z")

@RestSchema(schemaId = "cseuiprojectn52044")
@RequestMapping(path = "/CSE-UI-PROJECT-N52044", produces = MediaType.APPLICATION_JSON)
public class Cseuiprojectn52044Impl {

    @Autowired
    private Cseuiprojectn52044Delegate userCseuiprojectn52044Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseuiprojectn52044Delegate.helloworld(name);
    }

}
