package de.pfann.test.server;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("test")
public class RestTester {

    private Result result;

    public RestTester(){
        // default
        result = new Result();
        result.setEmail("email");
        result.setName("name");
        result.setPassword("password");
    }

    private RestTester(final Result aResult){
        result = aResult;
    }


    @GET
    @Log
    @Secured
    @Path("get/run")
    @Produces(MediaType.APPLICATION_JSON)
    public Result gerResultTestRuntimeException(){
        Executor executor = new Executor();
        executor.executeRuntimeException();
        return result;
        // http://192.168.2.103:8081/budget/test/get/run
    }


    @GET
    @Log
    @Secured
    @Path("get/exc")
    @Produces(MediaType.APPLICATION_JSON)
    public Result gerResultTestException() throws ClassNotFoundException {
        System.out.println("");
        Executor executor = new Executor();
        executor.executeException();
        return result;
        // http://192.168.2.103:8081/budget/test/get/exc
    }


    @GET
    @Log
    @Secured
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    public Result getResult(){
        return result;
    }


    @DELETE
    @Log
    @Secured
    @Path("delete/{id}")
    public void deleteResult(
            @PathParam("id") String aId){

        System.out.println("Deleted: " + aId);
    }


    @POST
    @Secured
    @Path("post/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postMethod(
            @PathParam("id") String id,
            Result aBody){

        System.out.println("Posted: " + id);
        System.out.println(aBody.getName());
        System.out.println(aBody.getEmail());
        System.out.println(aBody.getPassword());
    }

    @PATCH
    @Secured
    @Path("patch/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void sendPatch(
            @PathParam("id") String aId,
            Result aBody){

        System.out.println("Patched: " + aId);
        System.out.println(aBody.getName());
        System.out.println(aBody.getEmail());
        System.out.println(aBody.getPassword());
    }


    @PUT
    @Secured
    @Path("put/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void getPut(
            @PathParam("id") String aId,
            Result aBody){

        System.out.println("Put: " + aId);
        System.out.println(aBody.getName());
        System.out.println(aBody.getEmail());
        System.out.println(aBody.getPassword());

        }
}
