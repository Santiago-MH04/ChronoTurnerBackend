package org.springboot.riwi.chronoturner.backend.services.serviceImplementations;

import org.springboot.riwi.chronoturner.backend.dtos.request.CategoryRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.Category;
import org.springboot.riwi.chronoturner.backend.repositories.CategoryRepository;
import org.springboot.riwi.chronoturner.backend.services.entityServices.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
        //Atributos de CategoryServiceImpl
    private CategoryRepository repoCategory;

    //Constructores de CategoryServiceImpl
    //Asignadores de atributos de CategoryServiceImpl (setters)
    //Lectores de atributos de CategoryServiceImpl (getters)
        //Métodos de CategoryServiceImpl

    @Override
    public List<Category> readAll() {
        return this.repoCategory.findAll();
    }

    @Override
    public void removeById(String id) {
        this.repoCategory.deleteById(id);
    }

    /*@Override
    public Category save(CategoryRequestDTO entity) {
        return null;
    }*/

    @Override
    public void update(Category category) {
        this.repoCategory.save(category);
    }
}
