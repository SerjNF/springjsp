package ru.inbox.foreman.springjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.inbox.foreman.springjsp.entity.ContactEntity;

import ru.inbox.foreman.springjsp.service.ContactService;


import java.util.List;


@Controller
public class MyController {
    private final ContactService contactService;

    @Autowired
    public MyController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("contact", new ContactEntity());
        List listContact = contactService.listContactInfo();
        model.addAttribute("listContact", listContact);
        return "home";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") ContactEntity contact, BindingResult result) {
        contactService.addContact(contact);
        return "redirect:/";
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {
        contactService.removeContact(contactId);
        return "redirect:/";
    }

    @RequestMapping(value = "/contactInfo/{contactId}" , method = RequestMethod.GET)
    public String contactInfo(@PathVariable("contactId") Integer contactId, Model model) {
  //      contactService.contactInfo(contactId);
//        ContactEntity contactEntity = contactService.contactInfo(contactId);
        model.addAttribute("contact", contactService.contactInfo(contactId));
        return "information";
    }
}
