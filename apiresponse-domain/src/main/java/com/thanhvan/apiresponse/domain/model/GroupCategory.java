package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Entity
@Table(name = "group_category")
public class GroupCategory implements Serializable {
    @Id
    @Column(name = "id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String id;

    @Column(name = "name")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
