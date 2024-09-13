package org.springboot.riwi.chronoturner.backend.Controllers.InterfacesPerEntityControllers;

import org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods.*;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;


public interface InterfaceGoalControl extends
        Create<GoalRequest, String>,
        ById<String, GoalResponse>,
        ReadAll<GoalResponse>,
        Delete<String,String>, Put<GoalRequest,String,String> {
}
