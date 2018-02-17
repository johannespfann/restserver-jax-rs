package de.pfann.test.server;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ClassNotFoundExeptionMapper implements ExceptionMapper<ClassNotFoundException>{
    @Override
    public Response toResponse(ClassNotFoundException e) {
        System.out.println("produce response - BAD_GATEWAY");
        return Response.status(Response.Status.BAD_GATEWAY).build();
    }
}
