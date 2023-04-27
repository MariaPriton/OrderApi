package com.AKM.Order.Controller;

import com.AKM.Order.Model.Customer;
import com.AKM.Order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;


    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello";
    }


    @PostMapping("/postCustomer")
    public Customer  postCustomer(@RequestBody Customer customer){
        Customer result=orderService.postCustomer(customer);
        return result;
    }
}
