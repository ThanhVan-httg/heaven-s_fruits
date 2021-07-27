package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "bill_fruit")
public class BillFruit implements Serializable {
    public static final String TRANSFERED = "1";

    public static final String NOT_TRANSFERED = "0";

    @Id
    @Basic(optional = false)
    @Column(name = "bill_id" ,nullable=false)
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String billId;


    @Id
    @Basic(optional = false)
    @Column(name = "fruit_id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String fruitId;




}
