package org.oko.petclinic.services;

import java.util.Set;

/**
 * Created by 8e3Yn4uK on 10.05.2020.
 */

public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);


}
