package org.springboot.riwi.chronoturner.backend.controllers.interfacePerEntityControllers;

import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.*;
import org.springboot.riwi.chronoturner.backend.dtos.request.TaskRequestDTO;
import org.springboot.riwi.chronoturner.backend.dtos.request.UserRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Task;

public interface InterfaceTaskControl extends Create<TaskRequestDTO, Task>, //Save y Create son exactamente iguales
                                              Update<Task>,
                                              Remove<String>,
                                              ById<String, Task>{
    //Atributos de InterfaceTaskControl
    //Constructores de InterfaceTaskControl
    //Asignadores de atributos de InterfaceTaskControl (setters)
    //Lectores de atributos de InterfaceTaskControl (getters)
    //Métodos de InterfaceTaskControl
}
