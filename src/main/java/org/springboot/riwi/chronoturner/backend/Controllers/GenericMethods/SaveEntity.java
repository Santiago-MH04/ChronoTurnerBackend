
package org.springboot.riwi.chronoturner.backend.controllers.genericMethods;


public interface SaveEntity<Entity,EntityDTO>{
    public Entity save(EntityDTO entity);
}
