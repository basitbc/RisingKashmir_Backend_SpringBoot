package com.Rsl.Rising.Kashmir.Repository;

import com.Rsl.Rising.Kashmir.Entity.NewsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsTableRepository extends JpaRepository<NewsTable, Integer> {
}
