package org.springboot.riwi.chronoturner.backend.dtos.request;

import jakarta.validation.constraints.NotBlank;
import org.springboot.riwi.chronoturner.backend.entities.Category;
import org.springboot.riwi.chronoturner.backend.entities.Goal;
import org.springboot.riwi.chronoturner.backend.entities.User;

import java.time.LocalDateTime;

public class TaskRequestDTO {
        //Atributos de TaskRequestDTO
    @NotBlank(message = "Name field is required")
    private String name;
    private String description;
    @NotBlank(message = "It is required to select a deadline for your task")
    private LocalDateTime expirationDate;
    private Category category;
    private Goal goal;

    //Constructores de TaskRequestDTO
    //Asignadores de atributos de TaskRequestDTO (setters)
    //Lectores de atributos de TaskRequestDTO (getters)
    //Métodos de TaskRequestDTO
}
