package org.springboot.riwi.chronoturner.backend.controllers.genericMethods;

public interface Save<Entity,EntityDTO>{
    public Entity save(EntityDTO entity);
}
