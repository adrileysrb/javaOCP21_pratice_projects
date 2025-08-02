package com.small.endpoints;

import com.small.repository.VendaRepository;

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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll() {
        return Response.ok(repository.listAll()).build();
    }
}
