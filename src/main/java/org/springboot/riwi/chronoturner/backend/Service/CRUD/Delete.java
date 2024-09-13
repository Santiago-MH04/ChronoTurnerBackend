package org.springboot.riwi.chronoturner.backend.Service.CRUD;

public interface Delete <Entity,ID>{
    public void delete (Entity entity, ID id);
}
