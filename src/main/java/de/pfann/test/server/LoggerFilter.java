package de.pfann.test.server;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Log
@Provider
public class LoggerFilter implements ContainerRequestFilter {

    private String globalString;

    public LoggerFilter(final String app) {
        globalString = app;
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println("##### Receive new Request:");
        System.out.println(" -> " + containerRequestContext.getUriInfo().getAbsolutePath());
    }
}
