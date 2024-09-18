package org.springboot.riwi.chronoturner.backend.controllers.genericMethods;

public interface Put <Entity,ID,Response>{
    public Response put(Entity entity,ID id);
}
