package cz.educanet;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Produces(MediaType.APPLICATION_JSON)
@Path("zoo")
public class AnimalsResource {

    @Inject
    private AnimalsManager animalsManager;

    @GET
    public Response getAllAnimals() throws SQLException {
        return Response.ok(animalsManager.getAnimals()).build();
    }

}
