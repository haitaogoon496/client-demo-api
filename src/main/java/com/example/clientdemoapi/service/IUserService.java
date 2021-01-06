package com.example.clientdemoapi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("iUserService/")
public interface IUserService {


    @GetMapping("getUserNameById")
    String getUserNameById(@RequestParam("userId") Integer userId);

    @GetMapping(value = "getUserName/{name}")
    String getUserName(@PathVariable("name") String name);

}
