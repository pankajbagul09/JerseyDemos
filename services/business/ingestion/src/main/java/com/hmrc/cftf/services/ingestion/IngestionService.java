package com.hmrc.cftf.services.ingestion;

import com.hmrc.cftf.services.common.AbstractCompositeService;
import com.hmrc.cftf.services.common.AbstractCoreService;

public class IngestionService extends AbstractCompositeService<IngestionServiceRequest, IngestionServiceResponse> {
    private static String processFlowXmlPath = "classpath:ingestion/process-flow.xml";
    private static final String serviceName = "ingestionService";

    public IngestionService() {
        super(processFlowXmlPath, serviceName);
    }

    public IngestionServiceResponse getResponseTemplate() {
        return new IngestionServiceResponse();
    }

    public IngestionServiceRequest getRequestTemplate() {
        return new IngestionServiceRequest();
    }
}
