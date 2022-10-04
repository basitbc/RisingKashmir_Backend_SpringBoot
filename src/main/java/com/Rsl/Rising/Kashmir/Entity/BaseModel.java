//package com.Rsl.Rising.Kashmir.Entity;
//
//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.Column;
//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;
//import java.io.Serializable;
//import java.time.LocalDateTime;
//import java.util.Objects;
//
//
//@EntityListeners(AuditingEntityListener.class)
//@MappedSuperclass
//public abstract class BaseModel implements Serializable {
//
//    @Column(name = "created_by")
//    private String createdBy;
//
//    @CreatedDate
//    @Column(name = "creation_date", updatable = false)
//    private LocalDateTime creationDate;
//
//    @Column(name = "last_modified_by")
//    private String lastModifiedBy;
//
//    @LastModifiedDate
//    @Column(name = "last_modified_date", insertable = false)
//    private LocalDateTime lastModifiedDate;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        BaseModel baseModel = (BaseModel) o;
//        return Objects.equals(createdBy, baseModel.createdBy) && Objects.equals(creationDate, baseModel.creationDate) && Objects.equals(lastModifiedBy, baseModel.lastModifiedBy) && Objects.equals(lastModifiedDate, baseModel.lastModifiedDate);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(createdBy, creationDate, lastModifiedBy, lastModifiedDate);
//    }
//
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public LocalDateTime getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(LocalDateTime creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public String getLastModifiedBy() {
//        return lastModifiedBy;
//    }
//
//    public void setLastModifiedBy(String lastModifiedBy) {
//        this.lastModifiedBy = lastModifiedBy;
//    }
//
//    public LocalDateTime getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public BaseModel(String createdBy, LocalDateTime creationDate, String lastModifiedBy, LocalDateTime lastModifiedDate) {
//        this.createdBy = createdBy;
//        this.creationDate = creationDate;
//        this.lastModifiedBy = lastModifiedBy;
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public BaseModel() {
//    }
//}
