/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Jonathan
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of Ressource.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    @Path("txt")
    public String getText() {
        return "Mon premier service REST";
    }

    @PUT
    @Path("create")
    public String creaList() {
        ListClients test = createTest();
    return ("voici la liste créée :" + test.consulterListeClient());
    }

    @POST
    @Path("add")
    public String addCli(@QueryParam("prenom") String prenom,  @QueryParam("nom") String nom ) {

        Client c = new Client(nom, prenom);
        ListClients test = createTest();
        System.out.println("Liste avant ajout" + test.consulterListeClient());
        test.ajouterClientdansListe(c);
        return test.consulterListeClient();
    }

    @GET
    @Path("getcli")
    public String getClient(@QueryParam("id") int id) {
        ListClients test = createTest();
        return test.consulterClient(id);

    }

    @GET
    @Path("getLi")
    public String voirList() {
        ListClients test = createTest();
        return test.consulterListeClient();

    }
    
    @DELETE
    @Path("del")
    public String deleCli(@QueryParam("index")int index){
        ListClients test = createTest();
        test.supprimerClient(index);
        return test.consulterListeClient();
    }
   
    public ListClients createTest(){
        ListClients test = new ListClients();
        test.ajouterClientdansListe(new Client("Bob", "Dylan"));
        test.ajouterClientdansListe(new Client("Jojo", "Lafrite"));
        test.ajouterClientdansListe(new Client("Ouaf", "Miaou"));
        return test;
    }

}
