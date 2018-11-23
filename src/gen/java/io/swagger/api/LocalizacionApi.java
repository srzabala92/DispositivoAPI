package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.LocalizacionApiService;
import io.swagger.api.factories.LocalizacionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Localizacion;


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


@Path("/localizacion")


@io.swagger.annotations.Api(description = "the localizacion API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class LocalizacionApi  {
   private final LocalizacionApiService delegate;

   public LocalizacionApi(@Context ServletConfig servletContext) {
      LocalizacionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LocalizacionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LocalizacionApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = LocalizacionApiServiceFactory.getLocalizacionApi();
      }

      this.delegate = delegate;
   }


    @GET
    @Path("/{idPersona}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Obtener localizacion de persona", notes = "Obtener localizacion de una persona en tiempo real.", response = Localizacion.class, responseContainer = "List", tags={ "Localizacion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Localizacion del usuario", response = Localizacion.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class) })
    public Response localizacionIdPersonaGet(@ApiParam(value = "Id de la Persona del que añadir localización",required=true) @PathParam("idPersona") String idPersona
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.localizacionIdPersonaGet(idPersona,securityContext);
    }

    @POST
    @Path("/{idPersona}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Publicar localización de un usuario", notes = "Publicar localización de usuario en tiempo real", response = Void.class, tags={ "Localizacion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class) })
    public Response localizacionIdPersonaPost(@ApiParam(value = "" ,required=true) Localizacion body
,@ApiParam(value = "Id de la Persona del que añadir localización",required=true) @PathParam("idPersona") String idPersona
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.localizacionIdPersonaPost(body,idPersona,securityContext);
    }

}

