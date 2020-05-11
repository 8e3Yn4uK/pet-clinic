package org.oko.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.oko.petclinic.controller.PetClinic.VET_LIST_URL;

/**
 * Created by 8e3Yn4uK on 11.05.2020.
 */

@Controller
public class VetController {

    @RequestMapping(method = RequestMethod.GET, path = VET_LIST_URL)
    public String listVets() {

        return "vets/index";
    }
}
