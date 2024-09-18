package org.springboot.riwi.chronoturner.backend.services.entityServices;

import org.springboot.riwi.chronoturner.backend.dtos.request.CategoryRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Category;
import org.springboot.riwi.chronoturner.backend.services.methodServices.ReadAllService;
import org.springboot.riwi.chronoturner.backend.services.methodServices.RemoveService;
import org.springboot.riwi.chronoturner.backend.services.methodServices.SaveService;
import org.springboot.riwi.chronoturner.backend.services.methodServices.UpdateService;

public interface CategoryService extends ReadAllService<Category>,
                                         UpdateService<Category>,
                                         RemoveService<String> {
    //Atributos de CategoryService
    //Constructores de CategoryService
    //Asignadores de atributos de CategoryService (setters)
    //Lectores de atributos de CategoryService (getters)
    //Métodos de CategoryService
}
