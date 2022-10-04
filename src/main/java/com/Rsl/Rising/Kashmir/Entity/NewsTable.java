package com.Rsl.Rising.Kashmir.Entity;

import javax.persistence.*;

@Entity(name = "news_table")
public class NewsTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer newsId;
    @Column(name = "news_title")
    private String newsTitle;

    @Column(name = "news_description")
    private String newsDescription;

    @Column(name = "news_details")
    private String newsDetails;

    @Column(name = "category_id")
    private Integer categoryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="location_id")
    private LocationTable location;


    public NewsTable(Integer newsId, String newsTitle, String newsDescription, String newsDetails, Integer categoryId, LocationTable locationId) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
        this.newsDescription = newsDescription;
        this.newsDetails = newsDetails;
        this.categoryId = categoryId;
        this.location = locationId;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsDescription='" + newsDescription + '\'' +
                ", newsDetails='" + newsDetails + '\'' +
                ", categoryId=" + categoryId +
                ", locationId=" + location +
                '}';
    }
    public Integer getNewsId() {
        return newsId;
    }

    public NewsTable() {

    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public LocationTable getLocation() {
        return location;
    }

    public void setLocation(LocationTable location) {
        this.location = location;
    }



}
