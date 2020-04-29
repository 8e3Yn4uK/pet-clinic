package org.oko.petclinic.model;

import java.io.Serializable;

/**
 * Created by 8e3Yn4uK on 29.04.2020.
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
