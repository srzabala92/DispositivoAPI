package io.swagger.api.factories;

import io.swagger.api.LocalizacionApiService;
import io.swagger.api.impl.LocalizacionApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")
public class LocalizacionApiServiceFactory {
    private final static LocalizacionApiService service = new LocalizacionApiServiceImpl();

    public static LocalizacionApiService getLocalizacionApi() {
        return service;
    }
}
