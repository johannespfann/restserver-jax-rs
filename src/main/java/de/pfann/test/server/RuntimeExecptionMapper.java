package de.pfann.test.server;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RuntimeExecptionMapper implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(RuntimeException e) {
        System.out.println("produce repsonse - conflict");
        return Response.status(Response.Status.CONFLICT).build();
    }
}
