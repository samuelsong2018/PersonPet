package me.samuel.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PetRepository petRepository;

    @RequestMapping("/")
    public String index(Model model){
        Person person = new Person();
        person.setName("Billy Bob");

    person.setPets(pets);
    personRepository.save(person);
    }
}