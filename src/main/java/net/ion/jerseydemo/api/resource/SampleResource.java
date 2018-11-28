package net.ion.jerseydemo.api.resource;

import net.ion.jerseydemo.api.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by choki78@gmail.com on 2018-11-28
 * Github : https://github.com/choki78
 */
@Component
@Path("/sample")
public class SampleResource {
    @Autowired
    private SampleService sampleService;

    @GET
    @Path("/view")
    @Produces("application/json")
    public Response view() throws URISyntaxException {
        Map<String, Object> result = new HashMap<>();
        String msg = sampleService.getMessage();
        result.put("msg", msg);
        return javax.ws.rs.core.Response
                .status(200)
                .entity(result)
                .contentLocation(new URI("/api/sample/view")).build();
    }

    @POST
    @Path("/view")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces("application/json")
    public Response viewFormParam(@FormParam("id") @NotNull String id) throws URISyntaxException {
        Map<String, Object> result = new HashMap<>();
        sampleService.setMsg(id);
        String msg = sampleService.getMessage();
        result.put("msg", msg);
        return javax.ws.rs.core.Response
                .status(200)
                .entity(result)
                .contentLocation(new URI("/api/sample/view")).build();
    }

    @GET
    @Path("/view/{id}")
    @Produces("application/json")
    public Response viewPathParam(@PathParam("id") String id) throws URISyntaxException {
        Map<String, Object> result = new HashMap<>();
        sampleService.setMsg(id);
        String msg = sampleService.getMessage();
        result.put("msg", msg);
        return javax.ws.rs.core.Response
                .status(200)
                .entity(result)
                .contentLocation(new URI("/api/sample/view")).build();
    }
}
