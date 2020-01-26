package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RequestMapping("/image")
@RestController
public class ImageController {

    @GetMapping(produces = "image/jpg")
    public byte[] kot() throws IOException {
        InputStream stream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("kot.jpg");
        return stream.readAllBytes();
    };
}
