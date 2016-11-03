package com.hmrc.cftf.web.ingestion;
import com.hmrc.cftf.services.common.CoreService;
import com.hmrc.cftf.services.ingestion.IngestionService;
import com.hmrc.cftf.services.ingestion.IngestionServiceRequest;
import com.hmrc.cftf.services.ingestion.IngestionServiceResponse;
import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ingestion")
public class IngestionResource{

    private IngestionService ingestionService =  new IngestionService();


    @POST
    @Path("/publish")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public IngestionServiceResponse publish(IngestionServiceRequest request) {
        return ingestionService.invoke(request);

    }


}
