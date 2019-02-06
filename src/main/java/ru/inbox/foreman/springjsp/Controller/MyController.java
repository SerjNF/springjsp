package ru.inbox.foreman.springjsp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.inbox.foreman.springjsp.DAO.ContactDAO;
import ru.inbox.foreman.springjsp.Model.Contact;
import java.util.List;


@Controller
public class MyController {

    private final ContactDAO contactDAO;

    @Autowired
    public MyController(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        List<Contact> listContact = contactDAO.listContactInfo();
        model.addAttribute("listContact", listContact);
        return "home";
    }
}
