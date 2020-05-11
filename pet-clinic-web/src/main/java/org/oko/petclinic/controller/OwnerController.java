package org.oko.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.oko.petclinic.controller.PetClinic.OWNER_LIST_URL;

/**
 * Created by 8e3Yn4uK on 11.05.2020.
 */

@Controller
public class OwnerController {

    @RequestMapping(method = RequestMethod.GET, path = OWNER_LIST_URL)
    public String listOwners() {

        return "owner/index";
    }
}
