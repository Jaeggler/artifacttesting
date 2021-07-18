package com.unnamed.artifact2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtifactController {

    @GetMapping("/salute")
    public String salutation(){
        return "Hello player";
    }

    @GetMapping("/name/{id}")
    public String returnName(@PathVariable String id){
        return id;
    }
}
