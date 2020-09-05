package com.spring.deepak.jwtsecuritymongodb.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerRestController {

    @GetMapping("/public")
    public String publicContent(){
        return "Public Content";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminContent(){
        return "Admin Content";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userContent(){
        return "User Content";
    }

    @GetMapping("/both")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public String bothContent(){
        return "Both Content";
    }
}
