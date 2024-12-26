package funix.lab231x_ass18.controller;

import funix.lab231x_ass18.model.BlogEntry;
import funix.lab231x_ass18.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class OverviewController {

    @Autowired
    private BlogService blogService;
    @GetMapping("/Overview")
    public String overview(Model model) {
        List<BlogEntry> blogEntries = blogService.getAllBlogEntries();
        String title = LocalDate.now().getMonth().toString() + " " + LocalDate.now().getYear();
        model.addAttribute("title", title);
        model.addAttribute("blogEntries", blogEntries);
        return "Overview";
    }
}
