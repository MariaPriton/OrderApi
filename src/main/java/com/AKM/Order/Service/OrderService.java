package com.AKM.Order.Service;

import com.AKM.Order.Model.Customer;
import com.AKM.Order.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    CustomerRepository customerRepository;
    public  Customer postCustomer(Customer customer){
        Customer customer1=customerRepository.save(customer);
        return customer1;
    }
}
