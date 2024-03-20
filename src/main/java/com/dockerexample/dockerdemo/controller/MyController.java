/**
 * This class contains methods for implementing controller
 * MSA-E8
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.dockerexample.dockerdemo.controller;// controller to handle HTTP requests to the application

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/code")
public class MyController {
    @RequestMapping("/display")
    String display() {
        return "DOCKER Hello World";
    }
}