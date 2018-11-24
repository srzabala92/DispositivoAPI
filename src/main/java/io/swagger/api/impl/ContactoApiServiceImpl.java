package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Contacto;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class ContactoApiServiceImpl extends ContactoApiService {
    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();

    @Override
    public Response contactoIdPersonaPost(Contacto body, String idPersona, SecurityContext securityContext) throws NotFoundException {
        //Checking the request body fields
        if(body.getNombre() == null)
            return Response.status(405).entity("Debe introducir un nombre").build();
        if(body.getApellidos() == null)
            return Response.status(405).entity("Debe introducir el/los apellido/s").build();
        if(body.getDireccion() == null)
            return Response.status(405).entity("Debe introducir la direccion del contacto").build();
        if(body.getTelefono() == null)
            return Response.status(405).entity("Debe introducir un telefono de contacto").build();
        //Adding the contact to the list
        contactos.add(body);
        //Sending confirmation response    
        return Response.status(200).entity("Ha sido creado un nuevo contacto para el usuario con id: " + idPersona).build();
    }

}

