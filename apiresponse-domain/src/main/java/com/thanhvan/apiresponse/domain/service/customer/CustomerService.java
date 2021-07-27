
package com.thanhvan.apiresponse.domain.service.customer;

import com.thanhvan.apiresponse.domain.model.Customer;

public interface CustomerService {
    Customer findOne(String customerCode);

    Customer register(Customer customer, String rawPassword);
}
