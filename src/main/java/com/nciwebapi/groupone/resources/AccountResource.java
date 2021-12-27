package com.nciwebapi.groupone.resources;


import com.nciwebapi.groupone.Account;
import java.io.IOException;
import java.net.URI;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import storage.AccountStorage;


/**
 *
 * @author Alan.Mellowes
 */
@Path("/accounts")
public class AccountResource {
 UriInfo uriInfo;

Request request;
String account;
    
 public AccountResource(UriInfo uriinfo, Request request, String account){
   this.uriInfo = uriinfo;
   this.request = request;
   this.account = account;
  }
 public AccountResource(){
    }
  @POST
  @Path("add")
  @Produces(MediaType.TEXT_HTML)
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  public void newAccount(
         @FormParam("id") String str_id,
         @FormParam("customer_id") String str_customer_id,
         @FormParam("balance") String str_balance,
         @FormParam("acc_type") String acc_type,
         @FormParam("sort_code") String str_sort_code,
         @FormParam("acc_num") String str_acc_num,
         @Context HttpServletResponse servletResponse
    )throws IOException, NumberFormatException{
    int id = new Integer(str_id);
    int customer_id = new Integer(str_customer_id);
    double balance = new Double(str_balance);
    int sort_code = new Integer(str_sort_code);
    int acc_num = new Integer(str_acc_num);

    Account at = new Account(id, customer_id, balance, acc_type, sort_code, acc_num);
    AccountStorage.getStore().put(id, at);

    URI uri = uriInfo.getAbsolutePathBuilder().path(str_id).build();
    Response.created(uri).build();
    servletResponse.sendRedirect("../pages/CreateAccount.html");
}

@GET
@Path("/{id}")
@Produces({MediaType.APPLICATION_JSON})
public Account getAccount(@PathParam("id") Integer str_id){
Integer id;
try{
    id = new Integer(str_id);
    }catch(NumberFormatException e ){
        throw new NotFoundException("Supply number to get an amount");
    }
      Account act = AccountStorage.getStore().get(new Integer(id));
        if(act == null){
            throw new NotFoundException("Account with ID: "+id+" does not exist");
        }
     return act;
    }


  
}
