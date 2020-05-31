package org.oko.petclinic.services.map;

import org.oko.petclinic.model.BaseEntity;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by 8e3Yn4uK on 10.05.2020.
 */

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new IllegalArgumentException("Null object can`t be saved to db.");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = Long.valueOf(1L);
        }
        return nextId;
    }

    public static void main(String[] args) {
        Date date = new Date();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(date);
        System.out.println(ldt);
    }


}
