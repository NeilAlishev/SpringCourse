package ru.alishev.springcourse.FirstRestApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neil Alishev
 */
@RestController // @Controller + @ResponseBody над каждым методом
@RequestMapping("/api")
public class FirstRESTController {

    @GetMapping("/sayHello")
    public String sayHello() {
         return "Hello world!";
    }
}
