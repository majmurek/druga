package com.example.controller;

import com.example.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequestMapping("/body")
@RestController
public class BodyController {

    @PostMapping(path = "/uprosc", consumes = "application/json")
    public String uprosc(@RequestBody User user){
        return user.getImie() + " " + user.getNazwisko() + " lat " + user.getWiek();
    }



    @PostMapping(path ="/tablice" , consumes = "application/json")
    public String tablice(@RequestBody String[] strs) {
        return Stream.of(strs)// <---- coś nie gra z of
                .map(String::toUpperCase)
                .collect(Collectors.joining(";"));
    }

    @PostMapping(path = "/odwroc", consumes = "text/plain")
    public String odwroc(@RequestBody String string){
        char[] znaki = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = znaki.length - 1; i >= 0; --i){
            sb.append(znaki[i]);
        }
        return sb.toString();
    }

}
