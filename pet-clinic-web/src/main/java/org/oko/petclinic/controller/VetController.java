package org.oko.petclinic.controller;

import org.oko.petclinic.model.Vet;
import org.oko.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

import static org.oko.petclinic.controller.PetClinic.VET_LIST_URL;

/**
 * Created by 8e3Yn4uK on 11.05.2020.
 */

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(method = RequestMethod.GET, path = VET_LIST_URL)
    public String listVets(Model model) {

        Set<Vet> vetList = vetService.findAll();
        model.addAttribute("vetList", vetList);

        return "vets/index";
    }
}
