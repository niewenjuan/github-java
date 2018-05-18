package com.service.githubjava.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-18T06:37:42.237Z")

@RestSchema(schemaId = "githubjava")
@RequestMapping(path = "/github-java", produces = MediaType.APPLICATION_JSON)
public class GithubjavaImpl {

    @Autowired
    private GithubjavaDelegate userGithubjavaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userGithubjavaDelegate.helloworld(name);
    }

}
