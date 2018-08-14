package com.service.cseuiprojectn27097.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-14T02:01:06.704Z")

@RestSchema(schemaId = "cseuiprojectn27097")
@RequestMapping(path = "/CSE-UI-PROJECT-N27097", produces = MediaType.APPLICATION_JSON)
public class Cseuiprojectn27097Impl {

    @Autowired
    private Cseuiprojectn27097Delegate userCseuiprojectn27097Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCseuiprojectn27097Delegate.helloworld(name);
    }

}
