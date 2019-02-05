package ru.inbox.foreman.springjsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.inbox.foreman.springjsp.Entity.ContactEntity;
//import ru.inbox.foreman.springjsp.Model.Contact;



@Controller
public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelMap modelMap){
      //  modelMap.put("index", "Page Home");
        return new ModelAndView("home", "contact", new ContactEntity());
    }
}
