package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BateriaApiService;
import io.swagger.api.factories.BateriaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.NivelBateria;


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


@Path("/bateria")


@io.swagger.annotations.Api(description = "the bateria API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class BateriaApi  {
   private final BateriaApiService delegate;

   public BateriaApi(@Context ServletConfig servletContext) {
      BateriaApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BateriaApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BateriaApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BateriaApiServiceFactory.getBateriaApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Estado de la Bateria", notes = "Informacion sobre el nivel de carga y el tiempo restante de la bateria", response = NivelBateria.class, responseContainer = "List", tags={ "Bateria", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Nivel de Batería", response = NivelBateria.class, responseContainer = "List") })
    public Response bateriaGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.bateriaGet(securityContext);
    }

}

