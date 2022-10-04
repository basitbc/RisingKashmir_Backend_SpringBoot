package com.Rsl.Rising.Kashmir.Entity;


import javax.persistence.*;

@Entity(name="location_table")
public class LocationTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locationId;

    @Column(name="location_name")
    private String locationName;



    public int getLocationId() {
        return locationId;
    }

    @Override
    public String toString() {
        return "LocationTable{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                '}';
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public LocationTable(int locationId, String locationName) {
        this.locationId = locationId;
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public LocationTable() {

    }
}
