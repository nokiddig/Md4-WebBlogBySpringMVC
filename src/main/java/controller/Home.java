package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("sy", 1);
        return modelAndView;
    }
    @GetMapping("/")
    public ModelAndView showHome() {
        return new ModelAndView("/home");
    }
}
