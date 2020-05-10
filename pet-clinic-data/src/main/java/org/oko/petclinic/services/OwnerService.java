package org.oko.petclinic.services;

import org.oko.petclinic.model.Owner;

/**
 * Created by 8e3Yn4uK on 29.04.2020.
 */

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
