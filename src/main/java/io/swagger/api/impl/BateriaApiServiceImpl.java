package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.NivelBateria;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class BateriaApiServiceImpl extends BateriaApiService {
    /** Function to return to the client an example of the current device battery values **/
    @Override
    public Response bateriaGet(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(new NivelBateria(80.5, "5:30")).build();
    }
    
}

