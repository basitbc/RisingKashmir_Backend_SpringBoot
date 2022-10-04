package com.Rsl.Rising.Kashmir.Service.ServiceImpl;

import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import com.Rsl.Rising.Kashmir.Repository.LocationTableRepository;
import com.Rsl.Rising.Kashmir.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationTableRepository locationTableRepository;

    @Override
    public LocationTable saveLocation(LocationTable locationTable) {
        LocationTable locationTable1 = locationTableRepository.save(locationTable);
        return locationTable1;
    }

    @Override
    public List<LocationTable> getAllLocations() {
        return locationTableRepository.findAll();
    }

    @Override
    public LocationTable updateLocation(Integer id, LocationTable updateLocation) {
        LocationTable location = locationTableRepository.findById(id).orElse(null);
        if(location != null){
            if(updateLocation.getLocationName() != null){
                location.setLocationName(updateLocation.getLocationName());
            }
            return locationTableRepository.save(location);
        }
        return null;
    }

    @Override
    public Boolean deleteLocation(Integer id) {
        Optional<LocationTable> location = locationTableRepository.findById(id);
        if(location.isPresent()){
            locationTableRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public LocationTable getById(Integer id) {
        return locationTableRepository.findById(id).orElse(null);
    }
}
