package org.springboot.riwi.chronoturner.backend.Service.CRUD;

public interface Put <EntityRequest,ID,EntityResponse>{
    public void put(EntityRequest entityRequest, ID id, EntityResponse entityResponse);
}
