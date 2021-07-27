package com.thanhvan.apiresponse.app.welcome.app.bill;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderForm  implements Serializable {
    private static final long serialVersionUID = -2440173040819204374L;
    private List<String> id;
    private List<String>  name;

    private List<String>  price;

    private List<String>  count;

    private List<String>  customerId;
}
