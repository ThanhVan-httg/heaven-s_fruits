
package com.thanhvan.apiresponse.domain.service.customer;

import com.thanhvan.apiresponse.domain.model.Customer;
import com.thanhvan.apiresponse.domain.repository.customer.CustomerRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
    @Inject
    CustomerRepository customerRepository;


    @Inject
    PasswordEncoder passwordEncoder;

    @Override
    public Customer findOne(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer register(Customer customer, String rawPassword) {
        String password = passwordEncoder.encode(rawPassword);
        customer.setPassword(password);
        return customerRepository.save(customer);
    }

}
