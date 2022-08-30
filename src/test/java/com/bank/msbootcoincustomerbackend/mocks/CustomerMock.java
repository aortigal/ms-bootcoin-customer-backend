package com.bank.msbootcoincustomerbackend.mocks;

import com.bank.msbootcoincustomerbackend.models.documents.Customer;
import com.bank.msbootcoincustomerbackend.models.utils.enums.CustomerType;
import com.bank.msbootcoincustomerbackend.models.utils.enums.DocumentType;

import java.util.UUID;

public class CustomerMock {

    public static Customer random(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID().toString());
        customer.setCustomerType(CustomerType.BUYER);
        customer.setName(UUID.randomUUID().toString());
        customer.setDocumentNumber(UUID.randomUUID().toString());
        customer.setDocumentType(DocumentType.PASSPORT);
        customer.setPhoneNumber(UUID.randomUUID().toString());
        customer.setEmail(UUID.randomUUID().toString());
        return customer;
    }
}
