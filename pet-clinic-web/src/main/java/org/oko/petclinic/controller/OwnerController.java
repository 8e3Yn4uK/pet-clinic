package org.oko.petclinic.controller;

import org.oko.petclinic.model.Owner;
import org.oko.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

import static org.oko.petclinic.controller.PetClinic.OWNER_LIST_URL;

/**
 * Created by 8e3Yn4uK on 11.05.2020.
 */

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(method = RequestMethod.GET, path = OWNER_LIST_URL)
    public String listOwners(Model model) {

        Set<Owner> ownerList = ownerService.findAll();
        model.addAttribute("ownerList", ownerList);

        return "owner/index";
    }
}
