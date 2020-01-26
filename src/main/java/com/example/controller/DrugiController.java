package com.example.controller;

import org.apache.el.stream.Stream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RequestMapping("/param")
@RestController
public class DrugiController {

    @GetMapping("/tablice")
    public String tablice(String[] strs) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strs.length; i++){
            sb.append(strs[i]);
            if (i != strs.length - 1) {
                sb.append(";");
            }
        }

        return sb.toString();
    }

  /*  @GetMapping("/tablice2")
    public String tablice2(@RequestParam String[] strs){
        return Stream.of(strs) // <---- coś nie gra z of
                .collect(Collectors.joining(";"));
    }

   */

    @GetMapping("dodaj")
    public int dodaj(@RequestParam(required = false) Integer a,
                     @RequestParam(required = false) Integer b) {
        if(a == null){
            a = 0;
        }

        if(b == null){
            b = 0;
        }
        return a + b;

    }

    @GetMapping("odejmij")
    public int odejmowanie(@RequestParam("pierwsza") int a, @RequestParam("druga") int b) {
        return a - b;

    }

    @GetMapping("pomnoz")
    public int mnozenie(@RequestParam("pierwsza") int a, @RequestParam("druga") int b) {
        return a * b;

    }




}
