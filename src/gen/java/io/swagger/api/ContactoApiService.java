package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Contacto;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public abstract class ContactoApiService {
    
    public abstract Response contactoIdPersonaPost(Contacto body,String idPersona,SecurityContext securityContext) throws NotFoundException;
    
    //public abstract Response contactoIdPersonaPut(Contacto body,String idPersona,SecurityContext securityContext) throws NotFoundException;
    
}

