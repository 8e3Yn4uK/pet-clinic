package org.oko.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 8e3Yn4uK on 11.05.2020.
 */

@Controller
public class VetController {

    @RequestMapping({"/vets", "vets.index", "vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
