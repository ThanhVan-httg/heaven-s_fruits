package com.thanhvan.apiresponse.app.welcome.app.bill;

import lombok.Data;

import java.io.Serializable;

@Data
public class BillForm  implements Serializable {
    private static final long serialVersionUID = -2440173040819204374L;
    private String id;

    private String customerId;

    private String fruitId;

    private Integer amount;

    private Integer discount;
}
