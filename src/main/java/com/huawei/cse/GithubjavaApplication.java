package com.huawei.cse;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class GithubjavaApplication {
    public static void main(String[] args) {
         SpringApplication.run(GithubjavaApplication.class,args);
    }
}
