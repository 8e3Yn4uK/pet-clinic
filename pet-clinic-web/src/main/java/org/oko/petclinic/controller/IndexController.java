package org.oko.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 8e3Yn4uK on 11.05.2020.
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.hrml"})
    public String index() {

        return "index";
    }
}
