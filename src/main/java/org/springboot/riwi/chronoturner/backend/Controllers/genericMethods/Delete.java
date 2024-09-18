package org.springboot.riwi.chronoturner.backend.controllers.genericMethods;

public interface Delete <Entity,ID>{
    public Entity delete(ID id);
}