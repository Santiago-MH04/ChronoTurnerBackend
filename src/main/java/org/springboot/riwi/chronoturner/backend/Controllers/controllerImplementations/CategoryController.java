package org.springboot.riwi.chronoturner.backend.controllers.controllerImplementations;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springboot.riwi.chronoturner.backend.controllers.interfacePerEntityControllers.InterfaceCategoryControl;
import org.springboot.riwi.chronoturner.backend.dtos.request.CategoryRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Category;
import org.springboot.riwi.chronoturner.backend.services.entityServices.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.ServiceUnavailableException;
import java.util.List;

@RestController
@RequestMapping("/category")
@Tag(name = "Categories")
public class CategoryController implements InterfaceCategoryControl {
        //Atributos de CategoryController
    @Autowired
    private CategoryService categoryService;

    //Constructores de CategoryController
    //Asignadores de atributos de CategoryController (setters)
    //Lectores de atributos de CategoryController (getters)
        //Métodos de CategoryController

    @Override
    @GetMapping("/list")
    public List<Category> findAll() {
        return this.categoryService.readAll();
    }

    @Override
    public ResponseEntity<Category> create(CategoryRequestDTO entity) throws ServiceUnavailableException {
        return null;
    }

    @Override
    @GetMapping("/remove/{id}")
    public void removeEntity(String id) {
        /*this.categoryService.remove(category.getId());*/
        this.categoryService.removeById(id);
    }

    @Override
    public void update(Category category) {

    }
}
