package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "fruit")
public class Fruit implements Serializable {
    @Id
    @Column(name = "id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String id;

    @Column(name = "category_id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String categoryId;

    @Column(name = "name")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String name;

    @Column(name = "price")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Long price;

    @Column(name = "description")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String description;

    @Column(name = "images")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String images;

    @Column(name = "note")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String note;

    @Column(name = "number_sales")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Integer numberSales;

  /*  @ManyToMany(mappedBy = "fruits")
    private List<Bill> bills;*/


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNumberSales() {
        return numberSales;
    }

    public void setNumberSales(Integer numberSales) {
        this.numberSales = numberSales;
    }
}
