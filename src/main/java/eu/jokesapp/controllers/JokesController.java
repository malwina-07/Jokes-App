package eu.jokesapp.controllers;

import eu.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final JokesService  jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke", jokesService.getRandomJoke());
        return "index";
    }


//    strona na ktorej mozna stworzych inny banner.txt https://patorjk.com/
}
