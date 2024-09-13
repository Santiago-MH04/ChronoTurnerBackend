package org.springboot.riwi.chronoturner.backend.controllers.controllerImplementations;

import org.springboot.riwi.chronoturner.backend.services.entityServices.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
        //Atributos de TaskController
    @Autowired
    private TaskService service;

    //Constructores de TaskController
    //Asignadores de atributos de TaskController (setters)
    //Lectores de atributos de TaskController (getters)
    //Métodos de TaskController

}
