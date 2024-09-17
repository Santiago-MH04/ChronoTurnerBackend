package org.springboot.riwi.chronoturner.backend.Controllers.genericMethods;

public interface Delete <Entity,ID>{
    public Entity delete(ID id);
}