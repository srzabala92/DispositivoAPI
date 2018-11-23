package io.swagger.api.factories;

import io.swagger.api.ZonasApiService;
import io.swagger.api.impl.ZonasApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")
public class ZonasApiServiceFactory {
    private final static ZonasApiService service = new ZonasApiServiceImpl();

    public static ZonasApiService getZonasApi() {
        return service;
    }
}
