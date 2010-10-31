package org.agilestats.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * User: sjors
 * Date: Oct 31, 2010
 */
@Path("/issue")
public class IssueResource {

    @GET
    @Produces("application/json")
    @Path("{issueId}")
    public String getIssue(
            @PathParam("issueId") String issueId
    ) {
        return issueId;
    }

    
}
