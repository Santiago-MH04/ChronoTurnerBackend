package org.springboot.riwi.chronoturner.backend.Service.CRUD;

public interface ReadById <ID, Entity>{ //Se va
    public Entity readById(ID id);
}
