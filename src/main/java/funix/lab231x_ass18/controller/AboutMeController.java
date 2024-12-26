package funix.lab231x_ass18.controller;

import funix.lab231x_ass18.model.AboutMe;
import funix.lab231x_ass18.service.AboutMeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutMeController {

    @Autowired
    private AboutMeService aboutMeService;
    @GetMapping("/AboutMe")
    public String aboutMe(Model model, HttpServletRequest request) {
        AboutMe aboutMe = aboutMeService.getAboutMe();
        model.addAttribute("aboutMe", aboutMe);
        model.addAttribute("currentURI", request.getRequestURI());
        return "AboutMe";
    }
}
