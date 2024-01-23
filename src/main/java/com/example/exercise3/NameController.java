package com.example.exercise3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1")
public class NameController {

    @GetMapping(path = "/getName/{name}")
        public String getName(@PathVariable String name){
            return name;
    }

    @PostMapping(path = "/postName/{name}")
    public String mirrorName(@PathVariable String name){
        StringBuilder str = new StringBuilder(name);
        str.reverse();
        return str.toString();
    }

}
