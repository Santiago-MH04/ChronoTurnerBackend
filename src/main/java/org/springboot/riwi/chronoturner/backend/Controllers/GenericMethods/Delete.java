package org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods;

public interface Delete <Entity,ID>{
    public Entity delete(ID id);
}