package funix.lab231x_ass18.controller;

import funix.lab231x_ass18.model.BlogEntry;
import funix.lab231x_ass18.service.BlogService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BlogService blogService;


    @GetMapping("/Home")
    public String home(Model model, HttpServletRequest request) {
        List<BlogEntry> blogEntries = blogService.get4BlogEntries();
        model.addAttribute("currentURI", request.getRequestURI());
        model.addAttribute("blogEntries", blogEntries);
        return "Home";
    }


}
