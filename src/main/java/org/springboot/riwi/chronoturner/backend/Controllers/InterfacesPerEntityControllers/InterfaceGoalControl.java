package org.springboot.riwi.chronoturner.backend.controllers.InterfacesPerEntityControllers;

import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.*;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;

public interface InterfaceGoalControl extends
        Create<GoalRequest, String>,
        ById<String, GoalResponse>,
        ReadAll<GoalResponse>,
        Delete<String,String>, Put<GoalRequest,String,String> {
}
