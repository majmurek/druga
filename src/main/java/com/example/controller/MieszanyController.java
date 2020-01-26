package com.example.controller;

import com.example.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RequestMapping("/mieszany")
@RestController
public class MieszanyController {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class NotFoundException extends RuntimeException{

    }

    private User user;

    @PostMapping
    public User stworz(@RequestParam String imie,
                       @RequestParam String nazwisko,
                       @RequestParam int wiek) {
        user = new User(imie, nazwisko, wiek);
        return user;
    }

    @PatchMapping("dodaj/{uprawnienie}")
    public User dodaj(@PathVariable String uprawnienie){
        if (user == null){
            throw new NotFoundException();
        }
        user.addUprawnienia(uprawnienie);
        return user;
    }

    @PatchMapping("usun/{uprawnienie}")
    public User usun(@PathVariable String uprawnienie){
        if (user == null){
            throw new NotFoundException();
        }
        user.removeUprawnienia(uprawnienie);
        return user;
    }


}
