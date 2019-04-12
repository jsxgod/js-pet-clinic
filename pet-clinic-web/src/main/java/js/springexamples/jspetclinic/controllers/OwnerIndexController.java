package js.springexamples.jspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerIndexController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
