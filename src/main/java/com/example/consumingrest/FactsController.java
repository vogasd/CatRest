package com.example.consumingrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class FactsController {

    @GetMapping("/api/tutorial")
    public void getAll(){

    }

    @GetMapping("/api/tutorial/id")
    public void getById(){

    }

    @PostMapping("/api/tutorial")
    public void create(){

    }

}
