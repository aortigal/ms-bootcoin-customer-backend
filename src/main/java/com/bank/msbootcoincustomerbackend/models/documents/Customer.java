package com.bank.msbootcoincustomerbackend.models.documents;

import com.bank.msbootcoincustomerbackend.models.utils.Audit;
import com.bank.msbootcoincustomerbackend.models.utils.enums.CustomerType;
import com.bank.msbootcoincustomerbackend.models.utils.enums.DocumentType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document(collection = "customers")
public class Customer extends Audit {

    @Id
    private String id;

    @NotNull(message = "documentType must not be null")
    private CustomerType customerType;

    @NotNull(message = "documentNumber must not be null")
    private String documentNumber;

    @NotNull(message = "documentType must not be null")
    private DocumentType documentType;

    @NotNull(message = "phoneNumber must not be null")
    private String phoneNumber;

    @NotNull(message = "name must not be null")
    private String name;

    @NotNull(message = "email must not be null")
    private String email;

}
