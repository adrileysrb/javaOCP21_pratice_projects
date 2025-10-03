package com.small.endpoints;

import java.util.Map;

import com.small.repository.VendaRepository;
import com.small.services.VendaService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.GET;

@Path("/vendas")
public class VendaResources {
    @Inject
    VendaRepository repository;

    @Inject VendaService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll() {
        return Response.ok(repository.listAll()).build();
    }
    
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question01")
    public Response question01() {
        return Response.ok(service.question01()).build();
    }
    
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question02")
    public Response question02() {
        return Response.ok(service.question02()).build();
    }

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question03")
    public Response question03() {
        return Response.ok(Map.of("nome", service.question03())).build();
    }
    
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question04")
    public Response question04() {
        return Response.ok(service.question04()).build();
    }
    
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question05")
    public Response question05() {
        return Response.ok(service.question05()).build();
    }
    
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question07")
    public Response question07() {
        return Response.ok(service.question07()).build();
    }

    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/question08")
    public Response question08() {
        return Response.ok(service.question08()).build();
    }

    
}
