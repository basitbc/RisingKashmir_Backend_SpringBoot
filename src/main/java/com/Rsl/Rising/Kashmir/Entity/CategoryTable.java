package com.Rsl.Rising.Kashmir.Entity;

import javax.persistence.*;

@Entity(name="category_table")
public class CategoryTable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column(name="category_name")
    private String categoryName;

    public int getCategoryId() {
        return categoryId;

    }

    @Override
    public String toString() {
        return "CategoryTable{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public CategoryTable() {
    }

    public CategoryTable(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }





}
