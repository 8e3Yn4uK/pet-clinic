package org.oko.petclinic.services;

import org.oko.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by 8e3Yn4uK on 29.04.2020.
 */

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
