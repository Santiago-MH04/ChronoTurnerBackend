package org.springboot.riwi.chronoturner.backend.Controllers.genericMethods;

public interface Save<Entity,EntityDTO>{
    public Entity save(EntityDTO entity);
}
