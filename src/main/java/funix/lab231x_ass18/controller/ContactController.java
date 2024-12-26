package funix.lab231x_ass18.controller;

import funix.lab231x_ass18.model.Contact;
import funix.lab231x_ass18.service.ContactService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;
    @GetMapping("/Contact")
    public String contact(Model model, HttpServletRequest request) {
        model.addAttribute("contact", new Contact());
        model.addAttribute("currentURI", request.getRequestURI());
        return "Contact";
    }


    @PostMapping("/Contact")
    public String saveMessage(@ModelAttribute("contact") Contact contact,Model model) {

        contactService.saveMessage(contact);
        model.addAttribute("mess", "Thank you for your message!");
        // Giữ lại thông tin đã nhập
        model.addAttribute("contact", contact);
        model.addAttribute("readonly","readonly");
        model.addAttribute("buttonState","Sent");
        return "Contact";
    }
}
