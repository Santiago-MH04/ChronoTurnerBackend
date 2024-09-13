package org.springboot.riwi.chronoturner.backend.Service.CRUD;

import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;

import java.util.List;
import java.util.Optional;

public interface ReadAll <Entity>{
    public Optional<List<Entity>> readAll();

}
