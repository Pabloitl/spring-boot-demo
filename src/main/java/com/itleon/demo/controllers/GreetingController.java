package com.itleon.demo.controllers;

import com.itleon.demo.domain.Greeting;
import com.itleon.demo.domain.Person;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @PostMapping("/hi")
    public Greeting greet(@RequestBody Person person) {
        return Greeting.greet(person);
    }

}
