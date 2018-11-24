package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Zona;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T17:51:02.389Z[GMT]")

public class ZonasApiServiceImpl extends ZonasApiService {
    ZoneList allZones = new ZoneList(); //Object with all user zones lists
    /** ZoneList - Class that contains a structure which elements are:
        - An User Id
        - The zone list attached to that user
    **/
    public class ZoneList {
        private Map<String,ArrayList<Zona>> zones = new HashMap<String,ArrayList<Zona>>();
        //Initialize zone list with zones for user ids 1-5
        public ZoneList(){
            //Zone List User #1
            ArrayList<Zona> zonasUser = new ArrayList<Zona>();
            zonasUser.add(new Zona("DL-00001","Diurna Centro Usuario 1",new Localizacion(39.479461, -6.369936),800,"08:00","21:00"));
            zonasUser.add(new Zona("NL-00001","Nocturna Centro Usuario 1",new Localizacion(39.479461, -6.369936),30,"21:01","07:59"));
            zones.putIfAbsent("1", zonasUser);
            //Zone List User #2
            zonasUser.clear();
            zonasUser.add(new Zona("DL-00002","Diurna Centro Usuario 2",new Localizacion(39.59804, -6.221008),600,"08:00","19:00"));
            zonasUser.add(new Zona("NL-00002","Nocturna Centro Usuario 2",new Localizacion(39.59804, -6.221008),20,"19:01","07:59"));
            zones.putIfAbsent("2", zonasUser);
            //Zone List User #3
            zonasUser.clear();
            zonasUser.add(new Zona("DL-00003","Diurna Centro Usuario 3",new Localizacion(39.00000, -6.0000000),700,"08:30","19:30"));
            zonasUser.add(new Zona("NL-00003","Diurna Centro Usuario 3",new Localizacion(39.00000, -6.0000000),20,"19:31","08:29"));
            zonasUser.add(new Zona("WO-00003","Fin de semana Externa Usuario 3",new Localizacion(36.40000, -6.500000),5000,"08:30","20:30"));
            zones.putIfAbsent("3", zonasUser);
            //Zone List User #4
            zonasUser.clear();
            zonasUser.add(new Zona("DL-00004","Diurna Centro Usuario 4",new Localizacion(39.86000, -6.3420000),500,"07:30","19:30"));
            zonasUser.add(new Zona("NL-00004","Nocturna Centro Usuario 4",new Localizacion(39.86000, -6.4320000),20,"19:31","07:29"));
            zones.putIfAbsent("4", zonasUser);
            //Zone List User #5
            zonasUser.clear();
            zonasUser.add(new Zona("DL-00005","Diurna Centro Usuario 5",new Localizacion(39.46789, -6.3433000),500,"07:00","20:30"));
            zonasUser.add(new Zona("NL-00005","Nocturna Centro Usuario 5",new Localizacion(39.46789, -6.3433000),20,"19:29","07:29"));
            zonasUser.add(new Zona("WL-00005","Fin de Semana Centro Usuario 5",new Localizacion(39.46789, -6.3433000),900,"07:00","20:30"));
            zones.putIfAbsent("5", zonasUser);
        }
        // Return Zone List for given user (Null if doesn't occur)
        public ArrayList<Zona> getUserZones(String id){
            return zones.get(id);
        }
    }
    
    @Override
    public Response zonasIdPersonaGet(String idPersona, SecurityContext securityContext) throws NotFoundException {
        ArrayList<Zona> userZones = allZones.getUserZones(idPersona);//Zone list for chosen user id
        if (userZones != null) //If user zone list is on system
            return Response.status(200).entity(userZones).build();
        else //If this list doesn't occur
            return Response.status(403).entity("No existen zonas para ese usuario").build();
    }
    
}

