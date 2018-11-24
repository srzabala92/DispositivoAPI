package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Localizacion;


import java.util.Map;
import java.util.List;
import java.util.HashMap;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class LocalizacionApiServiceImpl extends LocalizacionApiService {
    //Localizacion ubiActual = new Localizacion(39.479461, -6.369936);

    public class LocalizationList{
        private Map<String,Localizacion> locs = new HashMap<String,Localizacion>();
        public LocalizationList() {
            //Generate sample location values for user ids 1-5
            locs.putIfAbsent("1", new Localizacion(39.479461, -6.369936));// Localization for user 1
            locs.putIfAbsent("2", new Localizacion(40.1006017, -5.58866));// Localization for user 2
            locs.putIfAbsent("3", new Localizacion(39.50000, -6.77777));// Localization for user 3
            locs.putIfAbsent("4", new Localizacion(39.2145517, -6.88846));// Localization for user 4
            locs.putIfAbsent("5", new Localizacion(40.007009, -5.532211));// Localization for user 5
        }
    }
    @Override
    public Response localizacionIdPersonaGet(String idPersona, SecurityContext securityContext) throws NotFoundException {
        //Returns an example localization value for a given user id
        
        //return Response.ok().entity(ubiActual).build();
    }
    
    @Override
    public Response localizacionIdPersonaPost(Localizacion body, String idPersona, SecurityContext securityContext) throws NotFoundException {
        if(idPersona == null)
            return Response.status(404).entity("Debe introducir un idPersonaCorrecto").build();
        //if(body.getLatitud() == null)
        //    return Response.status(405).entity("Debe introducir un nombre").build();
           
        return Response.ok().entity().build();
    }
    
}

