package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ZonasApiService;
import io.swagger.api.factories.ZonasApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Zona;


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


@Path("/zonas")


@io.swagger.annotations.Api(description = "the zonas API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class ZonasApi  {
   private final ZonasApiService delegate;

   public ZonasApi(@Context ServletConfig servletContext) {
      ZonasApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ZonasApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ZonasApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ZonasApiServiceFactory.getZonasApi();
      }

      this.delegate = delegate;
   }


    @GET
    @Path("/{idPersona}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Obtener lista zonas", notes = "Obtener lista de zonas de una determinada persona.", response = Zona.class, responseContainer = "List", tags={ "Zonas", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Zonas pertenecientes a la persona", response = Zona.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 503, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class) })
    public Response zonasIdPersonaGet(@ApiParam(value = "Id de la Persona del que añadir localización",required=true) @PathParam("idPersona") String idPersona
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.zonasIdPersonaGet(idPersona,securityContext);
    }

}

