package com.Rsl.Rising.Kashmir.Repository;

import com.Rsl.Rising.Kashmir.Entity.CategoryTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTableRepository extends JpaRepository<CategoryTable, Integer> {
}
