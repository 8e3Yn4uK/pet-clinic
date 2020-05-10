package org.oko.petclinic.services.map;

import org.oko.petclinic.model.Vet;
import org.oko.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by 8e3Yn4uK on 10.05.2020.
 */

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
