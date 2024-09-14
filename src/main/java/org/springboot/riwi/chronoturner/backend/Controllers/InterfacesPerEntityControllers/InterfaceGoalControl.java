package org.springboot.riwi.chronoturner.backend.controllers.InterfacesPerEntityControllers;

import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.Create;
import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.ById;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequestDTO;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springboot.riwi.chronoturner.backend.entities.Goal;

public interface InterfaceGoalControl extends
        Create<GoalRequestDTO, Goal>,
        ById<String, GoalResponse> {
    //Mover esta clase al lugar que le corresponde
}
