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
    LocationList localizaciones = new LocationList();
    /** LocationList - new class to create a container to store initial location values and handle post/get values actions**/
    public class LocationList{
        private Map<String,Localizacion> locs = new HashMap<String,Localizacion>();
        public LocationList() {
            //Generate sample location values for user ids 1-5
            locs.putIfAbsent("1", new Localizacion(39.479461, -6.369936));// Localization for user 1
            locs.putIfAbsent("2", new Localizacion(40.1006017, -5.58866));// Localization for user 2
            locs.putIfAbsent("3", new Localizacion(39.50000, -6.77777));// Localization for user 3
            locs.putIfAbsent("4", new Localizacion(39.2145517, -6.88846));// Localization for user 4
            locs.putIfAbsent("5", new Localizacion(40.007009, -5.532211));// Localization for user 5
        }
        /** Create a new location for an user which is not created **/
        public boolean postLocation(String id, Localizacion loc){
                return (locs.putIfAbsent(id,loc) == null); //If true, the new location item has been created (it didn't exist)
        }
        /** Return an user location given its Id (return 'null' if unexistent)**/
        public Localizacion getLocation(String id){
            return locs.get(id);
        }
    }
    @Override
    public Response localizacionIdPersonaGet(String idPersona, SecurityContext securityContext) throws NotFoundException {
        Localizacion userLoc = localizaciones.getLocation(idPersona);//Selected user localization
        if (userLoc == null) //Chosen user doesn't occur
            return Response.status(404).entity("El usuario seleccionado no existe").build();
        else //Returns user location
            return Response.status(200).entity(userLoc).build();
    }
    
    @Override
    public Response localizacionIdPersonaPost(Localizacion body, String idPersona, SecurityContext securityContext) throws NotFoundException {
        if(localizaciones.postLocation(idPersona, body))//if true, location has been created
           return Response.status(201).entity("Se ha añadido una nueva localizacion, cuyo usuario es: " + idPersona).build();
        else //Id location already existing on system
            return Response.status(403).entity("La localización para dicho usuario ya está en el sistema (para actualizarla, utilice la operación 'PUT'").build();
    }
    
}

