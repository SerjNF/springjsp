package ru.inbox.foreman.springjsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.inbox.foreman.springjsp.Model.Contact;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(ModelMap modelMap){
      //  modelMap.put("home", "Page Home");
        return new ModelAndView("home", "contact", new Contact());
    }
}
