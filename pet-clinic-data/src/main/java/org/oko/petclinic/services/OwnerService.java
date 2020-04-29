package org.oko.petclinic.services;

import org.oko.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by 8e3Yn4uK on 29.04.2020.
 */

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
