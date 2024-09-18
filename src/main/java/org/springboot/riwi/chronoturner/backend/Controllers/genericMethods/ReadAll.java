package org.springboot.riwi.chronoturner.backend.controllers.genericMethods;

import org.springframework.http.ResponseEntity;

import java.util.List;


public interface ReadAll<Entity> {
    public ResponseEntity<List<Entity>> readAll();
}
