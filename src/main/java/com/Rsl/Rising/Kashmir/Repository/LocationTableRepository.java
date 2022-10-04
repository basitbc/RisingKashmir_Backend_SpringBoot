package com.Rsl.Rising.Kashmir.Repository;

import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LocationTableRepository extends JpaRepository<LocationTable,Integer> {

//    @Query(value="SELECT * from location_table where location_id > :id", nativeQuery = true);


}
