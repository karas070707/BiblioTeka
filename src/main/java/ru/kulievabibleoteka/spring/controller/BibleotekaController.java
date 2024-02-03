package ru.kulievabibleoteka.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kulievabibleoteka.spring.dao.PersonDao;

@Controller
@RequestMapping("/person")
public class BibleotekaController {
    private final PersonDao personDao;
    @Autowired
    public BibleotekaController(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping()
    public String people(Model model){
    model.addAttribute("people",personDao.index());
        return "index";
    }
}
