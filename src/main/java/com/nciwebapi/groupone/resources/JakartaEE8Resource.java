package com.nciwebapi.groupone.resources;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import storage.AccountStorage;
import storage.CustomerStorage;
import storage.PaymentStorage;


@Path("/start")
public class JakartaEE8Resource {

    @Context
    HttpServletResponse response;
    @Context
    HttpServletRequest request;

    @javax.ws.rs.core.Context
    ServletContext context;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/initialise")
    public String hello() throws ServletException, IOException {
        CustomerStorage.getStore();
        AccountStorage.getStore();
        PaymentStorage.getStorage();

        RequestDispatcher dispatcher = context.getRequestDispatcher("/pages/hub.html");
        dispatcher.forward(request, response);

        return "";
    }
}
