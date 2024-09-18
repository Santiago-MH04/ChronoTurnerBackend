package org.springboot.riwi.chronoturner.backend.controllers.interfacePerEntityControllers;

import org.springboot.riwi.chronoturner.backend.controllers.genericMethods.*;
import org.springboot.riwi.chronoturner.backend.dtos.request.CategoryRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Category;

public interface InterfaceCategoryControl extends Create<CategoryRequestDTO, Category>,
                                                  Update<Category>,
                                                  Remove<Category>,
                                                  FindAll<Category>{
    //Atributos de InterfaceCategoryControl
    //Constructores de InterfaceCategoryControl
    //Asignadores de atributos de InterfaceCategoryControl (setters)
    //Lectores de atributos de InterfaceCategoryControl (getters)
    //Métodos de InterfaceCategoryControl
}
