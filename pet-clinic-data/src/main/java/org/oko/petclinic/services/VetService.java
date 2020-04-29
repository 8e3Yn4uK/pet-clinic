package org.oko.petclinic.services;


import org.oko.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by 8e3Yn4uK on 29.04.2020.
 */

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
