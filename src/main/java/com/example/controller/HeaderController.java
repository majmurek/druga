package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/header")
@RestController
public class HeaderController {

    @GetMapping("dodaj")
    public int dodaj(@RequestHeader("Header_A") int a,
                     @RequestHeader("Header_B") int b){
        return a + b;
    }

    @GetMapping("odejmij")
    public int odejmij(@RequestHeader("Header_A") int a,
                       @RequestHeader("Header_B") int b){
        return a - b;
    }

    @GetMapping("pomnoz")
    public int pomnoz(@RequestHeader("Header_A") int a,
                      @RequestHeader("Header_B") int b){
        return a * b;
    }



}
