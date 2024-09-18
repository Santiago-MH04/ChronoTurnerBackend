package org.springboot.riwi.chronoturner.backend.dtos.request;

import lombok.*;
import org.springboot.riwi.chronoturner.backend.entities.Task;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryRequestDTO {
        //Atributos de CategoryRequestDTO
    private String name;
    private String description;
    private String colour;
    /*private List<Task> taskList;*/

    //Constructores de CategoryRequestDTO
    //Asignadores de atributos de CategoryRequestDTO (setters)
    //Lectores de atributos de CategoryRequestDTO (getters)
    //Métodos de CategoryRequestDTO
}
