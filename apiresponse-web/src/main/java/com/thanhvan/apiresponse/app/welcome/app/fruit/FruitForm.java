package com.thanhvan.apiresponse.app.welcome.app.fruit;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class FruitForm implements Serializable {
    private static final long serialVersionUID = -2440173040819204374L;

    /*@NotEmpty*/
    @Size(max = 50)
    private String id;

    /*@NotEmpty*/
    @Size(max = 50)
    private String catagoryId;

    /*@NotNull*/
    @Size(max =256)
    private String name;

    /*@NotNull*/
    private Long price;

    /*@NotNull*/
    @Size(max = 1000)
    private String description;

    @Size(max = 1000)
    private String images;

    @Size(max = 256)
    private String note;

    @Max(50)
    private Integer numberSales;


}
