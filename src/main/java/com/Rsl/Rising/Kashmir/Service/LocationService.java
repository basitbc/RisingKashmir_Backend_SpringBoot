package com.Rsl.Rising.Kashmir.Service;

import com.Rsl.Rising.Kashmir.Entity.LocationTable;

import java.awt.print.Book;
import java.util.List;

public interface LocationService {
    LocationTable saveLocation(LocationTable locationTable);
    List<LocationTable> getAllLocations();
    LocationTable updateLocation(Integer id, LocationTable updateLocation);

    Boolean deleteLocation(Integer id);

    LocationTable getById(Integer id);
}
