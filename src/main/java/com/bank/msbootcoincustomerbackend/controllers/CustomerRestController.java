package com.bank.msbootcoincustomerbackend.controllers;

import com.bank.msbootcoincustomerbackend.handler.ResponseHandler;
import com.bank.msbootcoincustomerbackend.models.documents.Customer;
import com.bank.msbootcoincustomerbackend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/bootcoin/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Mono<ResponseHandler> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseHandler> find(@PathVariable String id) {
        return customerService.find(id);
    }

    @PostMapping
    public Mono<ResponseHandler> create(@Valid @RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @PutMapping("/{id}")
    public Mono<ResponseHandler> update(@PathVariable("id") String id,@Valid @RequestBody Customer customer) {
        return customerService.update(id,customer);
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseHandler> delete(@PathVariable("id") String id) {
        return customerService.delete(id);
    }
}
