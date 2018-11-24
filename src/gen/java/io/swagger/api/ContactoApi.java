package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ContactoApiService;
import io.swagger.api.factories.ContactoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Contacto;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/contacto")


@io.swagger.annotations.Api(description = "the contacto API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class ContactoApi  {
   private final ContactoApiService delegate;

   public ContactoApi(@Context ServletConfig servletContext) {
      ContactoApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ContactoApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ContactoApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ContactoApiServiceFactory.getContactoApi();
      }

      this.delegate = delegate;
   }


    @POST
    @Path("/{idPersona}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Publicar info de contacto", notes = "Añadir la información de contacto de un usuario dado su id", response = Void.class, tags={ "Contacto", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class) })
    public Response contactoIdPersonaPost(@ApiParam(value = "" ,required=true) Contacto body
,@ApiParam(value = "Id de la Persona del que añadir localización",required=true) @PathParam("idPersona") String idPersona
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contactoIdPersonaPost(body,idPersona,securityContext);
    }

   /* @PUT
    @Path("/{idPersona}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Actualizar info de contacto", notes = "Actualizar la información de contacto de un usuario dado su id", response = Void.class, tags={ "Contacto", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class) })
    public Response contactoIdPersonaPut(@ApiParam(value = "" ,required=true) Contacto body
,@ApiParam(value = "Id de la Persona del que añadir localización",required=true) @PathParam("idPersona") String idPersona
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contactoIdPersonaPut(body,idPersona,securityContext);
    }*/

}

