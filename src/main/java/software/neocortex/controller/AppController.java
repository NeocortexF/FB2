package software.neocortex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import software.neocortex.model.Message;
import software.neocortex.model.QueryExample;

@Controller

public class AppController {
    @Autowired
    Message message;
    @Autowired
    QueryExample queryExample;

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("bindingPoint", message.getHelloMessage());
        return "hello";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("createVariable", queryExample.tableCreation());
        return "creatingPage";
    }

}
