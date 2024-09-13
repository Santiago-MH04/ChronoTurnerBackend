package org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods;

public interface Put <Entity,ID,Response>{
    public Response put(Entity entity,ID id);
}
