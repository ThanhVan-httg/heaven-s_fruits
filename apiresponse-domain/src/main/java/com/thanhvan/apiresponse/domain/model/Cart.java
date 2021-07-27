package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@Entity
@Table(name = "cart")
public class Cart implements Serializable {
    @Id
    @Column(name = "id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String id;

    @Column(name = "customer_id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String customerId;

 /*   @OneToOne(fetch=FetchType.LAZY , optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;*/

    @Column(name = "amount")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Integer amount;

    @Column(name = "status")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String status;

    @Column(name = "create_date")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
