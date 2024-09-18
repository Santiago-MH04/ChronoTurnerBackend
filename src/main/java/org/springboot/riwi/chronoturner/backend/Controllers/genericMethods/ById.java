package org.springboot.riwi.chronoturner.backend.controllers.genericMethods;

import org.springframework.http.ResponseEntity;

public interface ById<ID, Entity> {

    public ResponseEntity<Entity> ById(ID id);
}
