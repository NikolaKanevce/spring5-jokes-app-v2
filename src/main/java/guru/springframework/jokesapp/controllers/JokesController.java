package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", this.jokesService.getJoke());
        return "index";
    }

}
