package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.alishev.springcourse.dao.PersonDAO;
import ru.alishev.springcourse.models.Person;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    private final PersonDAO personDAO;

    @Autowired
    public AdminController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String adminPage(Model model, @ModelAttribute("person") Person person) {
        model.addAttribute("people", personDAO.index());

        return "adminPage";
    }

    @PatchMapping("/add")
    public String makeAdmin(@ModelAttribute("person") Person person) {
        System.out.println(person.getId());

        return "redirect:/people";
    }
}
