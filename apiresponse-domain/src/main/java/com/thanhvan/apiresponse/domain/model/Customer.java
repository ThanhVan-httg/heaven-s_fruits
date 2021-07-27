package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Data
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @Column(name = "id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String id;

    @Column(name = "address")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String address;

    @Column(name = "name")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String name;

    @Column(name = "password")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String password;

    @Column(name = "email")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String email;

    @Column(name = "phone")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String phone;

    @Column(name = "valid")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String valid;

    @Column(name = "role")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String role;

    @Column(name = "create_date")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
