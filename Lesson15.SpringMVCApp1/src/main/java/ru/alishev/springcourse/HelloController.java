package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
