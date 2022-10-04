package com.Rsl.Rising.Kashmir.Service.ServiceImpl;

import com.Rsl.Rising.Kashmir.Entity.CategoryTable;
import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import com.Rsl.Rising.Kashmir.Repository.CategoryTableRepository;
import com.Rsl.Rising.Kashmir.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryTableRepository categoryTableRepository;

    @Override
    public CategoryTable saveCategory(CategoryTable categoryTable) {
        CategoryTable categoryTable1 = categoryTableRepository.save(categoryTable);
        return categoryTable1;
    }

    @Override
    public List<CategoryTable> getAllCategory() {
        return categoryTableRepository.findAll();
    }

    @Override
    public CategoryTable updateCategory(Integer id, CategoryTable updateCategory) {
        CategoryTable category = categoryTableRepository.findById(id).orElse(null);
        if(category != null){
            if(updateCategory.getCategoryName()!= null){
            category.setCategoryName(updateCategory.getCategoryName());
            }
            return categoryTableRepository.save(category);
        }
         return null;
    };

    @Override
    public Boolean deleteCategory(Integer id) {
        Optional<CategoryTable> category = categoryTableRepository.findById(id);
        if(category.isPresent()){
            categoryTableRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public CategoryTable getById(Integer id) {
        return categoryTableRepository.findById(id).orElse(null);
    }

}
