package org.springboot.riwi.chronoturner.backend.controllers.controllerImplementations;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springboot.riwi.chronoturner.backend.services.entityServices.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@Tag(name = "Goals")
public class TaskController {   //Aquí falta también implementar el controlador deseado, cuidadongos
        //Atributos de TaskController
    @Autowired
    private TaskService service;

    //Constructores de TaskController
    //Asignadores de atributos de TaskController (setters)
    //Lectores de atributos de TaskController (getters)
    //Métodos de TaskController

}
