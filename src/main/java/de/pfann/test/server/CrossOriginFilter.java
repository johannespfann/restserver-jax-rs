package de.pfann.test.server;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@CrossOrigin
@Provider
@PreMatching
public class CrossOriginFilter implements ContainerResponseFilter {

    public static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
    public static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
    public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";

    @Override
    public void filter(ContainerRequestContext aContainerRequestContext, ContainerResponseContext aResponseCxt) throws IOException {
        aResponseCxt.getHeaders().add(ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        aResponseCxt.getHeaders().add(ACCESS_CONTROL_ALLOW_METHODS,"PATCH, GET, POST, PUT, DELETE, OPTIONS, HEAD");
        aResponseCxt.getHeaders().add(ACCESS_CONTROL_ALLOW_HEADERS,"origin, content-type, accept, authorization");
    }



}
