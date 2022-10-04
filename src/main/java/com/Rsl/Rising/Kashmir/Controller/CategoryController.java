package com.Rsl.Rising.Kashmir.Controller;

import com.Rsl.Rising.Kashmir.Entity.CategoryTable;
import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import com.Rsl.Rising.Kashmir.Repository.CategoryTableRepository;
import com.Rsl.Rising.Kashmir.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category-table")
@CrossOrigin
public class CategoryController {
    @Autowired
   CategoryService categoryService;


    @PostMapping("/save")
    public ResponseEntity save(@RequestBody CategoryTable save){
        return  ResponseEntity.status(HttpStatus.OK).body(categoryService.saveCategory(save));
    }


    @GetMapping("/get-all-categories")
    public ResponseEntity getAllCategory(){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.getAllCategory());
    }


    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody CategoryTable update, @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.updateCategory(id, update));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.deleteCategory(id));
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity getLocationById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.getById(id));
    }




}
