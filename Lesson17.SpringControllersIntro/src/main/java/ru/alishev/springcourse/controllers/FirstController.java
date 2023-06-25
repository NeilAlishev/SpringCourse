package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {


    @GetMapping("/hello")
    public String helloPage(@RequestParam(value="a", required = false) int a,
                            @RequestParam(value="b", required = false) int b,
                            @RequestParam(value="action", required = false) String action,
                            Model model) {
        model.addAttribute("someMessage","result "+ a + action + b +" = " + calculate(a,b,action));

        //int sum = calculate(a,b,action);

        //System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }

    public int calculate(int a, int b, String action) {
        switch (action) {
            case "multiplication":
                return a * b;
            case "addition":
                return a+b;
            case "substruction":
                return a%b;
            case "division":
                return a-b;
            default: return 0;
        }
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
