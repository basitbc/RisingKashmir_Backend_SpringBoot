package com.Rsl.Rising.Kashmir.Controller;


import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import com.Rsl.Rising.Kashmir.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location-table")
@CrossOrigin
public class LocationController {

    @Autowired
    LocationService locationService;

//    Post Mapping is used to add a new data to LocationTable in Database
    @PostMapping("/save")  //to save
    public ResponseEntity save(@RequestBody LocationTable save){
        return  ResponseEntity.status(HttpStatus.OK).body(locationService.saveLocation(save));
    }


    //    Get Mapping is used to get data from LocationTable in Database
    @GetMapping("/get-all-locations")
    public ResponseEntity getAllLocation(){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.getAllLocations());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody LocationTable update, @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.updateLocation(id, update));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.deleteLocation(id));
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity getLocationById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(locationService.getById(id));
    }






}
