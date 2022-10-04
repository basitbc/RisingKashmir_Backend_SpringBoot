package com.Rsl.Rising.Kashmir.Service;

import com.Rsl.Rising.Kashmir.Entity.CategoryTable;
import com.Rsl.Rising.Kashmir.Entity.LocationTable;

import java.util.List;

public interface CategoryService {
    CategoryTable saveCategory(CategoryTable categoryTable);
    List<CategoryTable> getAllCategory();
    CategoryTable updateCategory(Integer id, CategoryTable updateCategory);
    Boolean deleteCategory(Integer id);
    CategoryTable getById(Integer id);
}
