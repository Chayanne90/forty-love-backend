package com.forty_love.controller;

import com.forty_love.service.CustomerService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/customers")
public class CustomerController {

    private CustomerService customerService;

}
