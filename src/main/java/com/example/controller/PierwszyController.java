package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RequestMapping("/test")
@RestController
public class PierwszyController {

    @GetMapping("/dodaj/{a}/{b}")
    public int dodaj(@PathVariable("a") int a, @PathVariable("b") int b){
        return a + b;
    }

    @GetMapping("/mnozenie/{a}/{b}")
    public int mnozenie(@PathVariable("a") int a, @PathVariable("b") int b){
        return a * b;
    }

    @GetMapping("/odejmowanie/{a}/{b}")
    public int odejmowanie(@PathVariable("a") int a, @PathVariable("b") int b){
        return a - b;
    }

    @GetMapping("/dzienTygodnia/{rok}/{miesiac}/{dzien}")
    public int dzienTygodnia(
            @PathVariable int dzien,
            @PathVariable int miesiac,
            @PathVariable int rok) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, rok);
        calendar.set(Calendar.MONTH, miesiac - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dzien);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }



    @GetMapping("/hello") //@RequestMapping(name = "/hello", method = RequestMethod.GET)
    public String helloworld() {
        return "Hello world";
    }

    @PostMapping
    public String helloworld2() {
        return "Hello world2";
    }

}
