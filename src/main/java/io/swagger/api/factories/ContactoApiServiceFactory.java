package io.swagger.api.factories;

import io.swagger.api.ContactoApiService;
import io.swagger.api.impl.ContactoApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")
public class ContactoApiServiceFactory {
    private final static ContactoApiService service = new ContactoApiServiceImpl();

    public static ContactoApiService getContactoApi() {
        return service;
    }
}
