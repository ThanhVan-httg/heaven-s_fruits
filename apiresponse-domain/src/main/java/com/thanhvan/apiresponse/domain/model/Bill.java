package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "bill")
public class Bill implements Serializable {
    public static final String TRANSFERED = "1";

    public static final String NOT_TRANSFERED = "0";


    @Basic(optional = false)
    @Column(name = "idPK" ,nullable=false)
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Integer idPK;

    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String id;

    @Column(name = "customer_id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String customerId;

    /*@JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;*/


  /*  @ManyToMany
    @JoinTable(name = "bill_fruit", joinColumns = @JoinColumn(name = "bill_id"), inverseJoinColumns = @JoinColumn(name = "fruit_id"))
    private List<Fruit> fruits;*/

    @Column(name = "fruit_id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String fruitId;

    @Column(name = "amount")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Long amount;

    @Column(name = "discount")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private Integer discount;



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

    public String getFruitId() {
        return fruitId;
    }

    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
