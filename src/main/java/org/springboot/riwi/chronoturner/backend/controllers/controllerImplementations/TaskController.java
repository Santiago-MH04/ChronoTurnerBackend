package org.springboot.riwi.chronoturner.backend.controllers.controllerImplementations;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springboot.riwi.chronoturner.backend.controllers.interfacePerEntityControllers.InterfaceTaskControl;
import org.springboot.riwi.chronoturner.backend.dtos.request.TaskRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Task;
import org.springboot.riwi.chronoturner.backend.services.entityServices.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.ServiceUnavailableException;

@RestController
@RequestMapping("/task")
@Tag(name = "Tasks")
public class TaskController implements InterfaceTaskControl {   //Aquí falta también implementar el controlador deseado, cuidadongos
        //Atributos de TaskController
    @Autowired
    private TaskService taskService;

    //Constructores de TaskController
    //Asignadores de atributos de TaskController (setters)
    //Lectores de atributos de TaskController (getters)
        //Métodos de TaskController

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Task> ById(@PathVariable String id) {
        return ResponseEntity.ok(this.taskService.readById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Task> create(@RequestBody @Valid TaskRequestDTO dtoEntity) throws ServiceUnavailableException {
        return ResponseEntity.ok(this.taskService.save(dtoEntity));
    }

    @Override
    @PatchMapping
    public void update(Task task) {
        /*ResponseEntity.ok(this.taskService.update(task));*/
        this.taskService.update(task);
    }

    @Override
    @GetMapping("/remove/{id}")
    public void removeEntity(String id) {
        /*ResponseEntity.ok(this.taskService.remove(id));*/
        this.taskService.removeById(id);
    }
}
