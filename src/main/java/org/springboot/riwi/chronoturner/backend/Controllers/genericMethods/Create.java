package org.springboot.riwi.chronoturner.backend.Controllers.genericMethods;

import org.springframework.http.ResponseEntity;

import javax.naming.ServiceUnavailableException;

public interface Create<EntityRequest,Entity>{

    public ResponseEntity<Entity> create(EntityRequest entity) throws ServiceUnavailableException;

}




