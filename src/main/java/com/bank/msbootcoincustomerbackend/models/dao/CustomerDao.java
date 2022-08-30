package com.bank.msbootcoincustomerbackend.models.dao;

import com.bank.msbootcoincustomerbackend.models.documents.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerDao extends ReactiveMongoRepository<Customer, String> {
}
