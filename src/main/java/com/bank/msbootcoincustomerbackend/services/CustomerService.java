package com.bank.msbootcoincustomerbackend.services;

import com.bank.msbootcoincustomerbackend.handler.ResponseHandler;
import com.bank.msbootcoincustomerbackend.models.documents.Customer;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<ResponseHandler> findAll();

    Mono<ResponseHandler> find(String id);

    Mono<ResponseHandler> create(Customer customer);

    Mono<ResponseHandler> update(String id, Customer customer);

    Mono<ResponseHandler> delete(String id);
}
