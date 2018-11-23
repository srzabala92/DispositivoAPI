package io.swagger.api.factories;

import io.swagger.api.BateriaApiService;
import io.swagger.api.impl.BateriaApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")
public class BateriaApiServiceFactory {
    private final static BateriaApiService service = new BateriaApiServiceImpl();

    public static BateriaApiService getBateriaApi() {
        return service;
    }
}
